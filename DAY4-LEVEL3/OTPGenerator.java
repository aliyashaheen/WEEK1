import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.print(otp + " ");
        }

        System.out.println("\nAre all OTPs unique? " + (areOTPsUnique(otpArray) ? "Yes" : "No"));
    }
}
