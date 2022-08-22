package main.constructionCompany.actions;

import main.constructionCompany.catalog.Creator;
import main.constructionCompany.enums.PhoneCode;
import main.constructionCompany.enums.Services;
import main.constructionCompany.projects.TypeProject;
import main.constructionCompany.projects.bathhouseProject.catalog.BathhouseProjectCatalog;
import main.constructionCompany.projects.highriseBuilding.catalog.HighriseBuildingCatalog;
import main.constructionCompany.projects.houseProject.catalog.HouseProjectCatalog;
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

    public static TypeProject projectChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        Services services;
        String service = new String();
        int i;
        TypeProject typeProject = null;
        do {
            logger.info("Choose the project you wish(enter a number):\n1 => BATHHOSE" +
                    "\n2 => HIGHRISE_BUILDING" +
                    "\n3 => HOUSE");
            i = scanner.nextInt();
            if (i < 1 || i > 3) {
                logger.info("Incorrect value, please try again! ");
                i = scanner.nextInt();
            }
            else {
                correct = true;
            }
        } while (correct != true);

        switch (i) {
            case (1):
                services = Services.CONSTRUCTION_OF_BATHHOSES;
                service = services.getDescription();
                logger.info(Creator.getBathhouseProjects());
                logger.info(service);

                correct = false;
                int j = 0;
                int projectNumber = 0;
                do {
                    logger.info("Do you want to choose a project?\n1 => YES\n2 => NO");
                    j = scanner.nextInt();
                    if (j < 1 || j > 2) {
                        logger.info("Incorrect value, please try again! ");
                        j = scanner.nextInt();
                    } if (j == 1) {
                        logger.info("Please enter the number of the project you like: ");
                        projectNumber = scanner.nextInt();
                        boolean correctIn = false;
                        do {
                            if (projectNumber < 1 || projectNumber > Creator.getBathhouseProjects().size()) {
                                logger.info("Incorrect value, please try again! ");
                                projectNumber = scanner.nextInt();
                            } else {
                                correctIn = true;
                            }
                        } while (correctIn != true);
                        typeProject = BathhouseProjectCatalog.getBathhouseProjectCatalog().findBathhouseProjectByNumber(projectNumber);
                    }
                    correct = true;
                } while (correct != true);

                correct = false;
                j = 0;
                do {
                    logger.info("Do you want to go back or change project?\n1 => YES\n2 => NO");
                    j = scanner.nextInt();
                    if (j < 1 || j > 2) {
                        logger.info("Incorrect value, please try again! ");
                        j = scanner.nextInt();
                    } if (j == 1) {
                        projectChoice();
                    }
                    correct = true;
                } while (correct != true);

                break;
            case (2):
                services = Services.CONSTRUCTION_OF_HIGHRISE_BUILDINGS;
                service = services.getDescription();
                logger.info(Creator.getHighriseBuildings());
                logger.info(service);

                correct = false;
                j = 0;
                projectNumber = 0;
                do {
                    logger.info("Do you want to choose a project?\n1 => YES\n2 => NO");
                    j = scanner.nextInt();
                    if (j < 1 || j > 2) {
                        logger.info("Incorrect value, please try again! ");
                        j = scanner.nextInt();
                    } if (j == 1) {
                        logger.info("Please enter the number of the project you like: ");
                        projectNumber = scanner.nextInt();
                        boolean correctIn = false;
                        do {
                            if (projectNumber < 1 || projectNumber > Creator.getHighriseBuildings().size()) {
                                logger.info("Incorrect value, please try again! ");
                                projectNumber = scanner.nextInt();
                            } else {
                                correctIn = true;
                            }
                        } while (correctIn != true);
                        typeProject = HighriseBuildingCatalog.getHighriseBuildingCatalog().findHighriseBuildingByNumber(projectNumber);
                    }
                    correct = true;
                } while (correct != true);

                correct = false;
                j = 0;
                do {
                    logger.info("Do you want to go back or change project?\n1 => YES\n2 => NO");
                    j = scanner.nextInt();
                    if (j < 1 || j > 2) {
                        logger.info("Incorrect value, please try again! ");
                        j = scanner.nextInt();
                    } if (j == 1) {
                        projectChoice();
                    }
                    correct = true;
                } while (correct != true);
                break;
            case (3):
                services = Services.CONSTRUCTION_OF_HOUSES;
                service = services.getDescription();
                logger.info(Creator.getHouseProjects());
                logger.info(service);

                correct = false;
                j = 0;
                projectNumber = 0;
                do {
                    logger.info("Do you want to choose a project?\n1 => YES\n2 => NO");
                    j = scanner.nextInt();
                    if (j < 1 || j > 2) {
                        logger.info("Incorrect value, please try again! ");
                        j = scanner.nextInt();
                    } if (j == 1) {
                        logger.info("Please enter the number of the project you like: ");
                        projectNumber = scanner.nextInt();
                        boolean correctIn = false;
                        do {
                            if (projectNumber < 1 || projectNumber > Creator.getHouseProjects().size()) {
                                logger.info("Incorrect value, please try again! ");
                                projectNumber = scanner.nextInt();
                            } else {
                                correctIn = true;
                            }
                        } while (correctIn != true);
                        typeProject = HouseProjectCatalog.getHouseProjectCatalog().findHouseProjectByNumber(projectNumber);
                    }
                    correct = true;
                } while (correct != true);

                correct = false;
                j = 0;
                do {
                    logger.info("Do you want to go back or change project?\n1 => YES\n2 => NO");
                    j = scanner.nextInt();
                    if (j < 1 || j > 2) {
                        logger.info("Incorrect value, please try again! ");
                        j = scanner.nextInt();
                    } if (j == 1) {
                        projectChoice();
                    }
                    correct = true;
                } while (correct != true);
                break;
        }
        return typeProject;
    }

    public static boolean serviceChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        boolean isMakeOrder = false;
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
            }
            else {
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
                    } if (j == 3) {
                        isMakeOrder = serviceChoice();
                    } if (j == 1) {
                        isMakeOrder = true;
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
                    } if (j == 3) {
                        isMakeOrder = serviceChoice();
                    } if (j == 1) {
                        isMakeOrder = true;
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
                    } if (j == 3) {
                        isMakeOrder = serviceChoice();
                    } if (j == 1) {
                        isMakeOrder = true;
                    }
                    correct = true;
                } while (correct != true);
                break;
            case (4):
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
                    } if (j == 3) {
                        isMakeOrder = serviceChoice();
                    } if (j == 1) {
                        isMakeOrder = true;
                    }
                    correct = true;
                } while (correct != true);
                break;
            case (5):
                service = "Creating...";
                logger.info(service);
                isMakeOrder = true;
        }
        return isMakeOrder;
    }
}
