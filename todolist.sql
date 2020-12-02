-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Des 2020 pada 06.51
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `todolist`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tugas`
--

CREATE TABLE `tugas` (
  `IDTugas` int(11) NOT NULL,
  `NamaTugas` varchar(100) NOT NULL,
  `StatusTugas` varchar(50) NOT NULL,
  `TglMulai` date DEFAULT NULL,
  `TglKadaluarsa` date DEFAULT NULL,
  `HariRutinitas` varchar(20) DEFAULT NULL,
  `TglSkrg` date NOT NULL,
  `Jenis` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tugas`
--

INSERT INTO `tugas` (`IDTugas`, `NamaTugas`, `StatusTugas`, `TglMulai`, `TglKadaluarsa`, `HariRutinitas`, `TglSkrg`, `Jenis`) VALUES
(48, 'Tubes PBO', 'Belum Selesai', NULL, NULL, NULL, '2020-12-02', 1),
(50, 'Beli Minum', 'Selesai', NULL, NULL, NULL, '2020-12-02', 1),
(51, 'Paper P.Web', 'Belum Selesai', '2020-12-02', '2020-12-05', NULL, '2020-12-02', 2),
(52, 'Olahraga', 'Selesai', '2020-12-02', '2020-12-02', 'Rabu', '2020-12-02', 5),
(54, 'Isi Pulsa', '', NULL, NULL, 'Rabu', '2020-12-02', 4),
(55, 'Siram Tanaman', 'Selesai', '2020-12-02', '2020-12-02', 'Rabu', '2020-12-02', 5),
(56, 'Program TBO', 'Selesai', '2020-12-02', '2020-12-09', NULL, '2020-12-02', 2);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tugas`
--
ALTER TABLE `tugas`
  ADD PRIMARY KEY (`IDTugas`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tugas`
--
ALTER TABLE `tugas`
  MODIFY `IDTugas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
