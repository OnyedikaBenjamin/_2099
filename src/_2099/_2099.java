package _2099;

public class _2099 {
        public static void main(String[] args) {
            int a = 2010;
            int b = 1500;
            System.out.println(CalculateAge(a, b).equals("You will be born in 510 years."));
        }

        public static String CalculateAge(int birth, int yearTo) {
            return (yearTo > birth && Math.abs(yearTo - birth) == 1) ? "You are " + (yearTo - birth) + " year old." :
                    (yearTo > birth) ? "You are " + (yearTo - birth) + " years old."
                            : (yearTo < birth && Math.abs(yearTo - birth) == 1) ? "You will be born in " + (birth - yearTo) + " year."
                            :(yearTo < birth) ? "You will be born in " + (birth - yearTo) + " years."
                            : "You were born this very year!";
        }
}
