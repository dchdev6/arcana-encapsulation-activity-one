import java.util.Scanner;
import java.util.regex.Pattern;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private int age;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String middleName, String lastName, String address, int age, int birthMonth, int birthDay, int birthYear) {
        firstName = firstName;
        middleName = middleName;
        lastName = lastName;
        address = address;
        age = age;
        birthMonth = birthMonth;
        birthDay = birthDay;
        birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        birthYear = birthYear;
    }

    public void inputPersonInfo(Scanner scanner) {
        System.out.println("Enter First Name: ");
        firstName = validateStringInput(scanner);

        System.out.println("Enter Middle Name: ");
        middleName = validateStringInput(scanner);

        System.out.println("Enter Last Name: ");
        lastName = validateStringInput(scanner);

        System.out.println("Enter Address: ");
        address = validateStringInput(scanner);

        while (true) {
            System.out.println("Enter Age: ");
            String ageInput = scanner.nextLine();
            try {
                age = Integer.parseInt(ageInput);
                if (age >= 0) {
                    break;
                } else {
                    System.out.println("Invalid age. Please enter a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Please enter a valid number.");
            }
        }

        while (true) {
            System.out.println("Enter Birth Month: ");
            String monthInput = scanner.nextLine();
            try {
                birthMonth = Integer.parseInt(monthInput);
                if (birthMonth >= 1 && birthMonth <= 12) {
                    break;
                } else {
                    System.out.println("Invalid month. Please enter a valid month (1-12).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid month. Please enter a valid number.");
            }
        }

        while (true) {
            System.out.println("Enter Birth Day: ");
            String dayInput = scanner.nextLine();
            try {
                birthDay = Integer.parseInt(dayInput);
                if (birthDay >= 1 && birthDay <= 31) {
                    break;
                } else {
                    System.out.println("Invalid day. Please enter a valid day (1-31).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid day. Please enter a valid number.");
            }
        }

        while (true) {
            System.out.println("Enter Birth Year: ");
            String yearInput = scanner.nextLine();
            try {
                birthYear = Integer.parseInt(yearInput);
                if (birthYear >= 1900 && birthYear <= 2100) {
                    break;
                } else {
                    System.out.println("Invalid year. Please enter a valid year (1900-2100).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter a valid number.");
            }
        }
    }

    private String validateStringInput(Scanner scanner) {
        String input;
        do {
            input = scanner.nextLine();
            if (!Pattern.matches("[a-zA-Z ]+", input)) {
                System.out.println("Invalid input. Please use only characters and spaces.");
            }
        } while (!Pattern.matches("[a-zA-Z ]+", input));
        return input;
    }

    public void displayPersonInfo() {
        System.out.println("\nPerson Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Birth Date: " + birthMonth + "/" + birthDay + "/" + birthYear);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();
        person.inputPersonInfo(scanner);
        person.displayPersonInfo();

        scanner.close();
    }
}
