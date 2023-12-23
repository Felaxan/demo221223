package tr.edu.medipol.yazilimortam;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void testFaktoriyelRec() {
		int sonuc = Hesaplamalar.faktoriyelRec(5);
		assertEquals(120, sonuc);
	}

	@Test
	public void testFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(120, sonuc);

	}
	@Test
	public void testCarpma() {
		int sonuc = Hesaplamalar.carpma(15, 10);
		assertEquals(150, sonuc);

	}
	@Test
	public void testCikar() {
		int sonuc = Hesaplamalar.cikart(20, 12);
		assertEquals(8, sonuc);

	}
	@Test
	public void testTopla() {
		int sonuc = Hesaplamalar.topla(15, 20);
		assertEquals(40, sonuc);

	}

}