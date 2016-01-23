
var imgs;
var cur=0;
var num;
var slide;
var leftside;
var rightside;
var winW = 630, winH = 460;
var borderwidth=40;

function slideshow()
{
	rightside=document.getElementById("right");
	leftside=document.getElementById("left");
	imgs=document.getElementsByTagName('img');
	num = imgs.length;
	slide=imgs[0];
	imgid=imgs[1].id;
	slide.src=imgs[1].src;
	winsize();
	rightside.style.left=winW-borderwidth+'px';
	var newdiv = document.createElement('div');
	rightside.appendChild(newdiv);
	var newdiv = document.createElement('div');
	leftside.appendChild(newdiv);
	next();
}

function click(evt) {
	x = mouseX(evt);
	y = mouseY(evt);
	//FIXME show the contents for the clicked element
}

function show() {
	next();
}

function prevnum(n){
	n -= 1;
	if(n < 1){
		n = num -1 ;
	}
	return n;
}

function prev(){
	cur = prevnum(cur);
	setImage();
}

function nextnum(n){
	n += 1;
	if(n > num - 1){
		n = 1;
	}
	return n;
}

function next(){
	cur = nextnum(cur);
	setImage();
}

function numdiv(element,string){
	var newdiv = document.createElement('div');
	newdiv.style.position='relative';
	newdiv.style.top=winH/2;
	newdiv.appendChild(document.createTextNode(string));
	element.replaceChild(newdiv,element.childNodes[0]);
	return newdiv
}

function setImage() {
	numdiv(rightside,nextnum(cur));
	numdiv(leftside,prevnum(cur));
	img=imgs[cur];
	height=img.height;
	if(img.width > winW - 2*borderwidth) {
		width=winw - 2*borderwidth;
	} else {
		width=img.width;
	}
	if(img.height * width / img.width > winH) {
		height=winH;
	} 
	width=img.width*height/img.height;
	x=borderwidth+(winW-width)/2
	y=(winH-height)/2
	//alert("height="+img.height+",width="+img.width+" w="+width +" h="+height + " x="+x+" y="+y);
	slide.style.top = y;
	slide.style.position = 'fixed';
	slide.style.left = x;
	slide.style.width = width;
	slide.style.height = height;
	slide.src=img.src;
}

//http://www.javascripter.net/faq/browserw.htm
function winsize() {
	if (document.body && document.body.offsetWidth) {
	 winW = document.body.offsetWidth;
	 winH = document.body.offsetHeight;
	}
	if (document.compatMode=='CSS1Compat' &&
	    document.documentElement &&
	    document.documentElement.offsetWidth ) {
	 winW = document.documentElement.offsetWidth;
	 winH = document.documentElement.offsetHeight;
	}
	if (window.innerWidth && window.innerHeight) {
	 winW = window.innerWidth;
	 winH = window.innerHeight;
	}
}

//http://javascript.about.com/library/blfollow1.htm
function mouseX(evt) {
	if (!evt) {
		evt = window.event;
	}
	if (evt.pageX) {
		return evt.pageX;
	} else if (evt.clientX) {
		return evt.clientX + (document.documentElement.scrollLeft ?  document.documentElement.scrollLeft : document.body.scrollLeft);
	} else {
		return 0;
	}
}

function mouseY(evt) {
	if (!evt) {
		evt = window.event;
	}
	if (evt.pageY) {
		return evt.pageY;
	} else if (evt.clientY) {
		return evt.clientY + (document.documentElement.scrollTop ? document.documentElement.scrollTop : document.body.scrollTop);
	} else {
		return 0;
	}
}
document.onclick = click;

