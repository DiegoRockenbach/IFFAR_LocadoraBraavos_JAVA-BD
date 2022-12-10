-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.20-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para diegor_2022
CREATE DATABASE IF NOT EXISTS `diegor_2022` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `diegor_2022`;

-- Copiando estrutura para tabela diegor_2022.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `Nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Senha` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela diegor_2022.admin: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`Nome`, `Senha`) VALUES
	('admin', 'admin');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- Copiando estrutura para tabela diegor_2022.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `COD` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `CPF` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `Endereço` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`COD`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela diegor_2022.cliente: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`COD`, `Nome`, `CPF`, `Endereço`) VALUES
	(1, 'Natália Bandeira', '280.060.200-22', 'Sangu'),
	(2, 'Diego Rockenbach', '290.594.002-29', 'BVB'),
	(4, 'Pedro Pastorio', '777.666.420-69', 'Três Passos'),
	(5, 'Luana Bonitos', '456.321.897-27', 'Humaitá'),
	(6, 'Isaac de Brito', '123.456.420-25', 'Braga');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Copiando estrutura para tabela diegor_2022.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `COD` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Preço` double NOT NULL,
  PRIMARY KEY (`COD`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela diegor_2022.produto: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` (`COD`, `Nome`, `Preço`) VALUES
	(1, 'Game of Thrones S01', 20),
	(2, 'The Hobbit', 10),
	(3, 'Eragon', 10),
	(4, 'Shrek (Trilogia)', 35),
	(5, 'House of the Dragon', 20),
	(6, 'HotWheels - Ataque do Tubarão', 15),
	(7, 'Star Wars - O Império Contra Ataca', 20),
	(8, 'Over The Garden Wall', 25),
	(9, 'Laputa - Um Castelo no Céu', 30);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;

-- Copiando estrutura para tabela diegor_2022.registro
CREATE TABLE IF NOT EXISTS `registro` (
  `COD` int(11) NOT NULL AUTO_INCREMENT,
  `codUSER` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Produto` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Cliente` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `DataRetiro` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `DataDevolucao` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`COD`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela diegor_2022.registro: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
INSERT INTO `registro` (`COD`, `codUSER`, `Produto`, `Cliente`, `DataRetiro`, `DataDevolucao`) VALUES
	(22, '1', 'Laputa - Um Castelo no Céu', 'Natália Bandeira', '04/12/2022', '11/12/2022'),
	(27, '4', 'Game of Thrones S01', 'Pedro Pastorio', '06/12/2022', '20/12/2022'),
	(28, '3', 'Star Wars - O Império Contra Ataca', 'Isaac de Brito', '09/12/2022', '16/12/2022'),
	(40, '3', 'Eragon', 'Gabriela Erthal', '01/12/2022', '15/12/2022'),
	(42, '2', 'Over the Garden Wall', 'Luana Bonitos', '08/12/2022', '22/12/2022');
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;

-- Copiando estrutura para tabela diegor_2022.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `COD` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `Senha` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`COD`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Copiando dados para a tabela diegor_2022.usuario: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`COD`, `Nome`, `Senha`) VALUES
	(1, 'gabi', 'cao'),
	(2, 'mathias', '321'),
	(3, 'pedro', '678'),
	(4, 'dog', 'cachorrao'),
	(5, 'natizika', '0209'),
	(6, 'diego', '888');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
