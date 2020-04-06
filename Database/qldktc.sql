-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.6-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.3.0.5771
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping structure for table dktc.tbl_dang_ky_day
CREATE TABLE IF NOT EXISTS `tbl_dang_ky_day` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_lop_hoc_phan` int(11) NOT NULL,
  `id_thanh_vien` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl_dang_ky_day_tbl_lop_hoc_phan` (`id_lop_hoc_phan`),
  KEY `FK_tbl_dang_ky_day_tbl_thanh_vien` (`id_thanh_vien`),
  CONSTRAINT `FK_tbl_dang_ky_day_tbl_lop_hoc_phan` FOREIGN KEY (`id_lop_hoc_phan`) REFERENCES `tbl_lop_hoc_phan` (`id`),
  CONSTRAINT `FK_tbl_dang_ky_day_tbl_thanh_vien` FOREIGN KEY (`id_thanh_vien`) REFERENCES `tbl_thanh_vien` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table dktc.tbl_dang_ky_day: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_dang_ky_day` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_dang_ky_day` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_dang_ky_hoc
CREATE TABLE IF NOT EXISTS `tbl_dang_ky_hoc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `diem_tp_1` int(11) DEFAULT NULL,
  `diem_tp_2` int(11) DEFAULT NULL,
  `diem_tp_3` int(11) DEFAULT NULL,
  `diem_thi` int(11) DEFAULT NULL,
  `diem_tb` int(11) DEFAULT NULL,
  `id_sinh_vien` int(11) NOT NULL,
  `id_lop_hoc_phan` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl_dang_ky_hoc_tbl_sinh_vien` (`id_sinh_vien`),
  KEY `FK_tbl_dang_ky_hoc_tbl_lop_hoc_phan` (`id_lop_hoc_phan`),
  CONSTRAINT `FK_tbl_dang_ky_hoc_tbl_lop_hoc_phan` FOREIGN KEY (`id_lop_hoc_phan`) REFERENCES `tbl_lop_hoc_phan` (`id`),
  CONSTRAINT `FK_tbl_dang_ky_hoc_tbl_sinh_vien` FOREIGN KEY (`id_sinh_vien`) REFERENCES `tbl_sinh_vien` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table dktc.tbl_dang_ky_hoc: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_dang_ky_hoc` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_dang_ky_hoc` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_don_vi
CREATE TABLE IF NOT EXISTS `tbl_don_vi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten_don_vi` varchar(50) NOT NULL,
  `mo_ta` varchar(50) DEFAULT NULL,
  `id_truong` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table dktc.tbl_don_vi: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_don_vi` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_don_vi` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_hoc_ky
CREATE TABLE IF NOT EXISTS `tbl_hoc_ky` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hoc_ky` int(11) NOT NULL,
  `id_nam_hoc` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl_hoc_ky_tbl_nam_hoc` (`id_nam_hoc`),
  CONSTRAINT `FK_tbl_hoc_ky_tbl_nam_hoc` FOREIGN KEY (`id_nam_hoc`) REFERENCES `tbl_nam_hoc` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table dktc.tbl_hoc_ky: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_hoc_ky` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_hoc_ky` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_ke_hoach_day
CREATE TABLE IF NOT EXISTS `tbl_ke_hoach_day` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_hoc_ky` int(11) NOT NULL,
  `id_mon_hoc` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl_ke_hoach_day_tbl_hoc_ky` (`id_hoc_ky`),
  KEY `FK_tbl_ke_hoach_day_tbl_mon_hoc` (`id_mon_hoc`),
  CONSTRAINT `FK_tbl_ke_hoach_day_tbl_hoc_ky` FOREIGN KEY (`id_hoc_ky`) REFERENCES `tbl_hoc_ky` (`id`),
  CONSTRAINT `FK_tbl_ke_hoach_day_tbl_mon_hoc` FOREIGN KEY (`id_mon_hoc`) REFERENCES `tbl_mon_hoc` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table dktc.tbl_ke_hoach_day: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_ke_hoach_day` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_ke_hoach_day` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_kip_hoc
CREATE TABLE IF NOT EXISTS `tbl_kip_hoc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ngay` date NOT NULL,
  `ca` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table dktc.tbl_kip_hoc: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_kip_hoc` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_kip_hoc` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_lich_hoc
CREATE TABLE IF NOT EXISTS `tbl_lich_hoc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_lop_hoc_phan` int(11) NOT NULL,
  `id_phong` int(11) NOT NULL,
  `id_kip_hoc` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl-lich_hoc_tbl_lop_hoc_phan` (`id_lop_hoc_phan`),
  KEY `FK_tbl-lich_hoc_tbl_phong_hoc` (`id_phong`),
  KEY `FK_tbl-lich_hoc_tbl_kip_hoc` (`id_kip_hoc`),
  CONSTRAINT `FK_tbl-lich_hoc_tbl_kip_hoc` FOREIGN KEY (`id_kip_hoc`) REFERENCES `tbl_kip_hoc` (`id`),
  CONSTRAINT `FK_tbl-lich_hoc_tbl_lop_hoc_phan` FOREIGN KEY (`id_lop_hoc_phan`) REFERENCES `tbl_lop_hoc_phan` (`id`),
  CONSTRAINT `FK_tbl-lich_hoc_tbl_phong_hoc` FOREIGN KEY (`id_phong`) REFERENCES `tbl_phong_hoc` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table dktc.tbl_lich_hoc: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_lich_hoc` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_lich_hoc` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_lop_hoc_phan
CREATE TABLE IF NOT EXISTS `tbl_lop_hoc_phan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) NOT NULL,
  `mota` varchar(50) DEFAULT NULL,
  `id_mon_hoc` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl_lop_hoc_phan_tbl_mon_hoc` (`id_mon_hoc`),
  CONSTRAINT `FK_tbl_lop_hoc_phan_tbl_mon_hoc` FOREIGN KEY (`id_mon_hoc`) REFERENCES `tbl_mon_hoc` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table dktc.tbl_lop_hoc_phan: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_lop_hoc_phan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_lop_hoc_phan` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_mon_hoc
CREATE TABLE IF NOT EXISTS `tbl_mon_hoc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) NOT NULL,
  `so_tin_chi` int(11) NOT NULL,
  `mo_ta` varchar(50) DEFAULT NULL,
  `id_don_vi` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Index 3` (`ten`),
  KEY `FK_tbl_mon_hoc_tbl_don_vi` (`id_don_vi`),
  CONSTRAINT `FK_tbl_mon_hoc_tbl_don_vi` FOREIGN KEY (`id_don_vi`) REFERENCES `tbl_don_vi` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table dktc.tbl_mon_hoc: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_mon_hoc` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_mon_hoc` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_nam_hoc
CREATE TABLE IF NOT EXISTS `tbl_nam_hoc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nam` year(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table dktc.tbl_nam_hoc: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_nam_hoc` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_nam_hoc` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_phong_hoc
CREATE TABLE IF NOT EXISTS `tbl_phong_hoc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) NOT NULL,
  `dung_luong` int(11) DEFAULT NULL,
  `id_toa_nha` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Index 3` (`ten`),
  KEY `FK_tbl_phong_hoc_tbl_toa_nha` (`id_toa_nha`),
  CONSTRAINT `FK_tbl_phong_hoc_tbl_toa_nha` FOREIGN KEY (`id_toa_nha`) REFERENCES `tbl_toa_nha` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table dktc.tbl_phong_hoc: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_phong_hoc` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_phong_hoc` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_sinh_vien
CREATE TABLE IF NOT EXISTS `tbl_sinh_vien` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_thanh_vien` int(11) NOT NULL,
  `ma_sv` varchar(50) NOT NULL,
  `nganh` varchar(50) DEFAULT NULL,
  `id_don_vi` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Index 4` (`ma_sv`),
  KEY `FK_tbl_sinh_vien_tbl_thanh_vien` (`id_thanh_vien`),
  KEY `FK_tbl_sinh_vien_tbl_don_vi` (`id_don_vi`),
  CONSTRAINT `FK_tbl_sinh_vien_tbl_don_vi` FOREIGN KEY (`id_don_vi`) REFERENCES `tbl_don_vi` (`id`),
  CONSTRAINT `FK_tbl_sinh_vien_tbl_thanh_vien` FOREIGN KEY (`id_thanh_vien`) REFERENCES `tbl_thanh_vien` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table dktc.tbl_sinh_vien: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_sinh_vien` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_sinh_vien` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_thanh_vien
CREATE TABLE IF NOT EXISTS `tbl_thanh_vien` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ho_ten` varchar(50) NOT NULL,
  `ngay_sinh` date DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `id_don_vi` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Index 2` (`email`,`username`),
  KEY `FK_tbl_thanh_vien_tbl_don_vi` (`id_don_vi`),
  CONSTRAINT `FK_tbl_thanh_vien_tbl_don_vi` FOREIGN KEY (`id_don_vi`) REFERENCES `tbl_don_vi` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table dktc.tbl_thanh_vien: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_thanh_vien` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_thanh_vien` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_toa_nha
CREATE TABLE IF NOT EXISTS `tbl_toa_nha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) NOT NULL,
  `mo_ta` varchar(50) DEFAULT NULL,
  `id_truong` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tbl_toa_nha_tbl_truong` (`id_truong`),
  CONSTRAINT `FK_tbl_toa_nha_tbl_truong` FOREIGN KEY (`id_truong`) REFERENCES `tbl_truong` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table dktc.tbl_toa_nha: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_toa_nha` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_toa_nha` ENABLE KEYS */;

-- Dumping structure for table dktc.tbl_truong
CREATE TABLE IF NOT EXISTS `tbl_truong` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten` varchar(50) NOT NULL,
  `mo_ta` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table dktc.tbl_truong: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_truong` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_truong` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
dktcdktcdktc