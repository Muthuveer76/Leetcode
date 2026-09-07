class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] a = num1.split("\\+");
        String[] b = num2.split("\\+");

        int ar = Integer.parseInt(a[0]);
        int ai = Integer.parseInt(a[1].replace("i", ""));
        int br = Integer.parseInt(b[0]);
        int bi = Integer.parseInt(b[1].replace("i", ""));

        int real = ar * br - ai * bi;
        int imaginary = ar * bi + ai * br;

        return real + "+" + imaginary + "i";
    }
}