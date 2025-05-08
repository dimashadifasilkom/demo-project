public class ContohTryCatch {
    public static void main(String[] args) {
        int[] angka = {1, 2, 0};
        try {
            int hasil = angka[0] / angka[2]; // Berpotensi menimbulkan ArithmeticException (pembagian dengan nol)
            System.out.println("Hasil pembagian: " + hasil);
            System.out.println(angka[3]); // Berpotensi menimbulkan ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.err.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Terjadi kesalahan indeks array: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan umum: " + e.getMessage());
        }
        System.out.println("Program tetap berjalan setelah penanganan exception.");
    }
}
