package org.rulez.magwas.zenta.model.manager;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.rulez.magwas.nonnul.NonNullEntry;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;

public class ByteArrayStorageTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private ByteArrayStorage bas;
	private byte[] bytes;
	private File testFile;

	@Before
	public void setUp() {
		bas = new ByteArrayStorage();
		bytes = "foo".getBytes();
		testFile = new File(ModelTestUtils.convertNameToResourcePath("img1.png"));
		assertFalse(bas.hasEntry("foo"));
	}

	@Test
	public void getKey_returns_the_key_for_a_byte_array() {
		bas.addByteContentEntry("foo", bytes);
		assertEquals("foo",bas.getKey(bytes));
	}

	@Test
	public void getKey_returns_null_for_nonexisting_item_with_empty_storage() {
		assertNull(bas.getKey("foo".getBytes()));
	}

	@Test
	public void getKey_throws_exception_for_nonexisting_item_with_nonempty_storage() {
		bas.addByteContentEntry("foo", bytes);
		assertNull(bas.getKey("bar".getBytes()));
	}

	@Test
	public void testGetEntrySize() {
		bas.addByteContentEntry("foo", bytes);
		assertEquals(3,bas.getEntrySize("foo"));
	}

	@Test
	public void getEntrySet_returns_all_entries() {
		bas.addByteContentEntry("foo", bytes);
		NonNullList<NonNullEntry<String, byte[]>> entrySet = bas.getEntrySet();
		assertEquals("foo",entrySet.get(0).getKey());
	}

	@Test
	public void testHasEntries() {
		assertFalse(bas.hasEntries());
		bas.addByteContentEntry("foo", bytes);
		assertTrue(bas.hasEntries());
	}

	@Test
	public void removeEntry_removes_an_entry() throws IOException {
		bas.addFileContentEntry("foo", testFile);
		assertTrue(bas.hasEntry("foo"));
		bas.removeEntry("foo");
		assertFalse(bas.hasEntry("foo"));
	}

	@Test
	public void getEntry_gets_entry_as_byte_array() throws IOException {
		bas.addFileContentEntry("foo", testFile);
		byte[] i = bas.getEntry("foo");
		InputStream is = bas.getInputStream("foo");
		byte[] array2 = IOUtils.toByteArray(is);
		assertArrayEquals(array2, i);
	}

	@Test
	public void addFileContentEntry_adds_the_contents_of_a_file() throws IOException {
		bas.addFileContentEntry("baz", testFile);
		assertEntryIsTestFile("baz");
	}

	@Test
	public void addStreamEntry_adds_stream_entry() throws FileNotFoundException, IOException {
		String entryName = "bar";
		bas.addStreamEntry(entryName, new FileInputStream(testFile));
		assertEntryIsTestFile(entryName);
	}

	private void assertEntryIsTestFile(String entryName) throws IOException {
		InputStream is = bas.getInputStream(entryName);
		byte[] array2 = IOUtils.toByteArray(is);
		byte[] array1 = bas.getBytesFromFile(testFile);
		assertArrayEquals(array2, array1);
	}

	private void assertArrayEquals(byte[] array2, byte[] array1) {
		assertEquals(new String(array1),new String(array2));
	}

	@Test
	public void addByteContentEntry_adds_byte_contents() {
		bas.addByteContentEntry("foo", bytes);
		assertTrue(bas.hasEntry("foo"));
		assertEquals(bytes,bas.getEntry("foo"));
	}

	@Test
	public void getBytesFromFile_gets_bytes_from_file() throws IOException {
		bytes = bas.getBytesFromFile(testFile);
		String s = new String(bytes,"UTF-8");
		assertEquals("PNG",s.substring(1, 4));
	}

	@Test
	public void getBytesFromFile_throws_exception_for_nonexisting_file() throws IOException {
		File file = new File("foo");
		exception.expect(NoSuchFileError.class);
		bas.getBytesFromFile(file);
	}

	@Test
	public void adding_the_same_bytes_twice_result_in_one_storage() {
		byte[] fub = bytes.clone();
		bas.addByteContentEntry("foo",bytes);
		bas.addByteContentEntry("bar",fub);
		assertEquals(
				bas.getEntry("foo").hashCode(),
				bas.getEntry("bar").hashCode()
				);
	}
}
