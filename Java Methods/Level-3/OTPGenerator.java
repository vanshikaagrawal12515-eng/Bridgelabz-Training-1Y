import java.util.HashSet;

public class OTPGenerator {
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();

        for (int otp : otps) {
            if (set.contains(otp)) {
                return false; 
            }
            set.add(otp);
        }
        return true; 
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }

        if (areUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTP found.");
        }
    }
}