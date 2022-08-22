package main.constructionCompany.actions;

import main.constructionCompany.people.customer.Customer;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.constructionCompany.actions.Choice.countryChoice;
import static org.apache.commons.lang3.StringUtils.capitalize;

public class Registration {
    private static final Logger logger = LogManager.getLogger(Registration.class);

    public static Customer registration() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        boolean nameStatus = false;
        boolean surnameStatus = false;
        boolean phoneNumberStatus = false;
        boolean passwordStatus = false;
        boolean ageStatus = false;
        List<String> customerData = new ArrayList<>();

        File customerFile = new File("src/main/resources/customer.txt");

        String hello = "welcome to customer registration";
        logger.info(capitalize(hello));

        do {
            logger.info("Enter your name: ");
            String name = scanner.nextLine();
            if (name.matches("[A-Z][a-z]+")) {
                customer.setName(name);
                customerData.add("Name: " + customer.getName());
                nameStatus = true;
            } else {
                logger.info("Please, use a capital letter at the beginning of a word!");
            }
        } while (nameStatus != true);

        do {
            logger.info("Enter your surname: ");
            String surname = scanner.nextLine();
            if (surname.matches("[A-Z][a-z]+")) {
                customer.setSurname(surname);
                customerData.add("Surname: " + customer.getSurname());
                surnameStatus = true;
            } else {
                logger.info("Please, use a capital letter at the beginning of a word!");
            }
        } while (surnameStatus != true);

        do {
            logger.info("Enter the password: ");
            String password = scanner.nextLine();
            if (password.length() >= 6) {
                customer.setPassword(password);
                customerData.add("Password: " + customer.getPassword());
                passwordStatus = true;
            } else {
                logger.info("Password must have at least 6 characters!");
            }
        } while (passwordStatus != true);

        do {
            logger.info("Enter the phone number:");
            String phoneNumberCode = countryChoice();
            logger.info(phoneNumberCode);
            String phoneNumber = scanner.nextLine();
            boolean phoneNumberInt = false;
            while(!phoneNumberInt) {
                try {
                    Integer.parseInt(phoneNumber);
                    phoneNumberInt = true;
                } catch (NumberFormatException e) {
                    logger.info("Try again!");
                    phoneNumberInt = false;
                    phoneNumber = scanner.nextLine();
                }
            }
            String ph = phoneNumberCode + phoneNumber;
            if (phoneNumber.length() == 9) {
                customer.setPhoneNumber(ph);
                customerData.add("Phone number: " + customer.getPhoneNumber());
                phoneNumberStatus = true;
            } else {
                logger.info("Phone number must have 13 characters! \n EX: (+380994445566)");
            }
        } while (phoneNumberStatus != true);

        do {
            logger.info("Enter your age:");
            int age = scanner.nextInt();
            if (age >= 18) {
                customer.setAge(age);
                customerData.add("Age: " + customer.getAge());
                ageStatus = true;
            } else {
                logger.info("Your age less then 18! You can`t make an order!");
            }
        } while (ageStatus != true);

        logger.info("Thank you for the registration!!");

        FileUtils.writeLines(customerFile, customerData);
        return customer;
    }
}
