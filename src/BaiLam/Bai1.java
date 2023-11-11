package BaiLam;

public class Bai1 {
	public final double LUONGCS = 7920000;
	
	public double tienBaoHiemTra(int tuoi, double tongChiPhi, int soNamTGLT, boolean dungTuyen, boolean thuocHoNgheo) {
		if (tuoi > 0 && tuoi < 6 && tongChiPhi/LUONGCS < 0.15 && soNamTGLT >= 5 && dungTuyen) {
			return tongChiPhi;
		}
		else if (thuocHoNgheo) {
			return 0.95*tongChiPhi;
		}
		else {
			return 0.8*tongChiPhi;
		}
	}
}
