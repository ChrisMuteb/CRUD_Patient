CREATE DATABASE
IF NOT EXISTS `patient_directory`;
USE `patient_directory`;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient`
(
    `pat_num_HC` int NOT NULL AUTO_INCREMENT,
    `pat_lastname` varchar(45) DEFAULT NULL,
    `pat_firstname` varchar(45) DEFAULT NULL,
    `pat_address` varchar(45) DEFAULT NULL,
    `pat_tel` varchar(45) DEFAULT NULL,
    `pat_insurance_id` int DEFAULT NULL,
    `pat_subscription_date` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`pat_num_HC`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Table for table `patient`
--

INSERT INTO `patient` VALUES
    (1256987452365, 'Martin', 'Bernard', 'Chatillon', '0106060606', 2, '01/10/2010'),
    (1852458963215, 'Chalme', 'Antoine', 'Paris', '0105050505', 1, '01/01/2017'),
    (1985236548520, 'Daulne', 'Paul', 'Puteaux', '0107070707', 3, '01/05/2008'),
    (2365987542365, 'Solti', 'Anna', 'Montrouge', '0108080808', 4, '01/10/2010'),
    (2758965423102, 'Chalme', 'Julie', 'Paris', '0105050505', 1, '01/06/2017'),
    (2658954875210, 'Dart', 'Pauline', 'Bourg la reine', '0109090909', 4, '01/01/2015');


