package main.constructionCompany.actions;

import main.constructionCompany.enums.PhoneCode;
import main.constructionCompany.enums.Services;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Choice {
    private static final Logger logger = LogManager.getLogger(Choice.class);
    public static String countryChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        PhoneCode phoneCode;
        String phoneCode1 = new String();
        int i;
        do {
            logger.info("Choose your country(enter a number):\n1 => UKRAINE\n2 => LITHUANIA\n3 => LATVIA\n4 => ESTONIA\n5 => AUSTRIA");
            i = scanner.nextInt();
            if (i < 1 || i > 5) {
                logger.info("Incorrect value, please try again! ");
                i = scanner.nextInt();
            } else {
                correct = true;
            }
        } while (correct != true);

        switch (i) {
            case (1):
                phoneCode = PhoneCode.UKRAINE;
                phoneCode1 = phoneCode.getCode();
                break;
            case (2):
                phoneCode = PhoneCode.LITHUANIA;
                phoneCode1 = phoneCode.getCode();
                break;
            case (3):
                phoneCode = PhoneCode.LATVIA;
                phoneCode1 = phoneCode.getCode();
                break;
            case (4):
                phoneCode = PhoneCode.ESTONIA;
                phoneCode1 = phoneCode.getCode();
                break;
            case (5):
                phoneCode = PhoneCode.AUSTRIA;
                phoneCode1 = phoneCode.getCode();
                break;
        }
        return phoneCode1;
    }

    public static int serviceChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        Services services;
        String service = new String();
        int i;
        int j = 0;
        do {
            logger.info("Choose the service you wish(enter a number):\n1 => CONSTRUCTION_OF_BATHHOSES" +
                    "\n2 => CONSTRUCTION_OF_HIGHRISE_BUILDINGS" +
                    "\n3 => CONSTRUCTION_OF_HOUSES" +
                    "\n4 => OTHER_SERVICES" +
                    "\n5 => CREATE MY ORDER");
            i = scanner.nextInt();
            if (i < 1 || i > 5) {
                logger.info("Incorrect value, please try again! ");
                i = scanner.nextInt();
            } else {
                correct = true;
            }
        } while (correct != true);

        switch (i) {
            case (1):
                services = Services.CONSTRUCTION_OF_BATHHOSES;
                service = services.getDescription();
                logger.info(service);
                correct = false;
                do {
                    logger.info("Do you want to create an order?\n1 => YES\n2 => NO\n3 => I WANT TO REVIEW SERVICES");
                    j = scanner.nextInt();
                    if (j < 1 || j > 3) {
                        logger.info("Incorrect value, please try again! ");
                        j = scanner.nextInt();
                    }
                    if (j == 3) {
                        serviceChoice();
                    }
                    correct = true;
                } while (correct != true);
                break;
            case (2):
                services = Services.CONSTRUCTION_OF_HIGHRISE_BUILDINGS;
                service = services.getDescription();
                logger.info(service);
                correct = false;
                do {
                    logger.info("Do you want to create an order?\n1 => YES\n2 => NO\n3 => I WANT TO REVIEW SERVICES");
                    j = scanner.nextInt();
                    if (j < 1 || j > 3) {
                        logger.info("Incorrect value, please try again! ");
                        j = scanner.nextInt();
                    }
                    if (j == 3) {
                        serviceChoice();
                    }
                    correct = true;
                } while (correct != true);
                break;
            case (3):
                services = Services.CONSTRUCTION_OF_HOUSES;
                service = services.getDescription();
                logger.info(service);
                correct = false;
                do {
                    logger.info("Do you want to create an order?\n1 => YES\n2 => NO\n3 => I WANT TO REVIEW SERVICES");
                    j = scanner.nextInt();
                    if (j < 1 || j > 3) {
                        logger.info("Incorrect value, please try again! ");
                        j = scanner.nextInt();
                    }
                    if (j == 3) {
                        serviceChoice();
                    }
                    correct = true;
                } while (correct != true);
                break;
            case (4): //show contacts
                services = Services.OTHER_SERVICES;
                service = services.getDescription();
                logger.info(service);
                correct = false;
                do {
                    logger.info("Do you want to create an order?\n1 => YES\n2 => NO\n3 => I WANT TO REVIEW SERVICES");
                    j = scanner.nextInt();
                    if (j < 1 || j > 3) {
                        logger.info("Incorrect value, please try again! ");
                        j = scanner.nextInt();
                    }
                    if (j == 3) {
                        serviceChoice();
                    }
                    correct = true;
                } while (correct != true);
                break;
            case (5):
                service = "Creating...";
                logger.info(service);
                j = 1;
                break;
        }
        return j;
    }
}
