package BaiLam;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestC2 {
	private Bai1 bai1 = new Bai1();
	public final double LUONGCS = 7920000;
	
	void executeTest(int tuoi, double tongChiPhi, int soNamTGLT, boolean dungTuyen, boolean thuocHoNgheo, double expectedValue) {
		assertEquals(expectedValue, bai1.tienBaoHiemTra(tuoi, tongChiPhi, soNamTGLT, dungTuyen, thuocHoNgheo));
	}
	
	@Test
	void TH1() {
		int tuoi = 0;
		double tongChiPhi = 0.14*LUONGCS;
		int soNamTGLT = 5;
		boolean dungTuyen = true;
		boolean thuocHoNgheo = false;
		double expectedValue = 0;
		executeTest(tuoi, tongChiPhi, soNamTGLT, dungTuyen, thuocHoNgheo, expectedValue);
	}

	@Test
	void TH2() {
		int tuoi = 5;
		double tongChiPhi = 0.14*LUONGCS;
		int soNamTGLT = 5;
		boolean dungTuyen = true;
		boolean thuocHoNgheo = false;
		double expectedValue = tongChiPhi;
		executeTest(tuoi, tongChiPhi, soNamTGLT, dungTuyen, thuocHoNgheo, expectedValue);
	}
	
	@Test
	void TH3() {
		int tuoi = 6;
		double tongChiPhi = 0.14*LUONGCS;
		int soNamTGLT = 5;
		boolean dungTuyen = false;
		boolean thuocHoNgheo = false;
		double expectedValue = 0.8*tongChiPhi;
		executeTest(tuoi, tongChiPhi, soNamTGLT, dungTuyen, thuocHoNgheo, expectedValue);
	}
	
	@Test
	void TH4() {
		int tuoi = 5;
		double tongChiPhi = 0.15*LUONGCS;
		int soNamTGLT = 5;
		boolean dungTuyen = true;
		boolean thuocHoNgheo = false;
		double expectedValue = 0.8*tongChiPhi;
		executeTest(tuoi, tongChiPhi, soNamTGLT, dungTuyen, thuocHoNgheo, expectedValue);
	}
	
	@Test
	void TH5() {
		int tuoi = 5;
		double tongChiPhi = 0.14*LUONGCS;
		int soNamTGLT = 4;
		boolean dungTuyen = false;
		boolean thuocHoNgheo = false;
		double expectedValue = 0.8*tongChiPhi;
		executeTest(tuoi, tongChiPhi, soNamTGLT, dungTuyen, thuocHoNgheo, expectedValue);
	}
	
	@Test
	void TH6() {
		int tuoi = 5;
		double tongChiPhi = 0.14*LUONGCS;
		int soNamTGLT = 5;
		boolean dungTuyen = false;
		boolean thuocHoNgheo = false;
		double expectedValue = 0.8*tongChiPhi;
		executeTest(tuoi, tongChiPhi, soNamTGLT, dungTuyen, thuocHoNgheo, expectedValue);
	}
	
	@Test
	void TH7() {
		int tuoi = 5;
		double tongChiPhi = 0.14*LUONGCS;
		int soNamTGLT = 5;
		boolean dungTuyen = false;
		boolean thuocHoNgheo = true;
		double expectedValue = 0.95*tongChiPhi;
		executeTest(tuoi, tongChiPhi, soNamTGLT, dungTuyen, thuocHoNgheo, expectedValue);
	}
	
	@Test
	void TH8() {
		int tuoi = 5;
		double tongChiPhi = 0.14*LUONGCS;
		int soNamTGLT = 5;
		boolean dungTuyen = false;
		boolean thuocHoNgheo = false;
		double expectedValue = 0.8*tongChiPhi;
		executeTest(tuoi, tongChiPhi, soNamTGLT, dungTuyen, thuocHoNgheo, expectedValue);
	}
}
