CREATE TABLE IF NOT EXISTS `javadb`.`product` (
  `id` VARCHAR(255) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `price_in_cents` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

USE `javadb`