pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				sh 'set'
				withCredentials([string(credentialsId: 'issuetoken', variable: 'issuetoken')]) {
					sh 'PATH=$(pwd)/tools:$PATH ./tools/testenv tools/entrypoint make' 
				} 
			} 
		}
		stage('Publish') {
			steps {
				withCredentials([sshUserPrivateKey(credentialsId: 'repo_deploy_key', keyFileVariable: 'identity', passphraseVariable: '', usernameVariable: 'userName')]) {

					script {
						def remote = [:]
						remote.name = 'repo.kodekonveyor.com'
						remote.host = 'repo.kodekonveyor.com'
						remote.user = userName
						remote.identityFile = identity
						remote.port = 22023
						remote.knownHosts = '/var/lib/jenkins/.ssh/known_hosts'
						def targetDir = "${env.BRANCH_NAME}--${env.BUILD_NUMBER}"
						def dirName = targetDir.replace("/","__")
						def repofullname = sh (
    						script: "git remote -v |grep '^origin.*fetch)' |sed 's/.git / /;s/ (.*//;sA.*/AA'",
    						returnStdout: true
						).trim()
						def projectName = repofullname.replace("^.*/","")
						sh "echo ${targetDir}"
						sh "echo ${dirName}"
						sh "echo JOB_BASE_NAME:${JOB_BASE_NAME}"
						sh "echo project:${projectName}"
						sh "mkdir -p shippable"
						sh "mv target shippable/${dirName}"
						sshPut remote: remote, from: "shippable/${dirName}", into: "${projectName}"
					}
				}
			}
		}
	}
	post {
		always {
			sh 'git clean -fdx'
    }
  }
}
