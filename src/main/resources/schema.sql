CREATE TABLE IF NOT EXISTS Produkt(
id INT AUTO_INCREMENT PRIMARY KEY,
bezeichnung TINYTEXT,
preis DECIMAL(5, 2) UNSIGNED NOT NULL,
gewicht DECIMAL(5, 2) UNSIGNED NOT NULL,
hersteller TINYTEXT,
fertigungsTag DATE, -- Datum-Format muss YYY-MM-DD sein
lagerungsTemperatur DECIMAL(3, 2)
);

CREATE TABLE IF NOT EXISTS Lebensmittelprodukt AS SELECT * FROM Produkt;
ALTER TABLE Lebensmittelprodukt ADD COLUMN IF NOT EXISTS mindesthaltbarkeitsdatum DATE; -- Datum-Format muss YYY-MM-DD sein
ALTER TABLE Lebensmittelprodukt ADD COLUMN IF NOT EXISTS vegan BOOLEAN;
ALTER TABLE Lebensmittelprodukt ADD COLUMN IF NOT EXISTS vegetarisch BOOLEAN;
ALTER TABLE Lebensmittelprodukt ADD COLUMN IF NOT EXISTS tierisch BOOLEAN;
ALTER TABLE Lebensmittelprodukt ADD COLUMN IF NOT EXISTS glutenfrei BOOLEAN;
ALTER TABLE Lebensmittelprodukt ADD COLUMN IF NOT EXISTS laktosefrei BOOLEAN;
ALTER TABLE Lebensmittelprodukt ADD COLUMN IF NOT EXISTS zuckerfrei BOOLEAN;
ALTER TABLE Lebensmittelprodukt ADD COLUMN IF NOT EXISTS inhaltsstoffe TEXT;

CREATE TABLE IF NOT EXISTS Elektronikprodukt AS SELECT * FROM Produkt;
ALTER TABLE Elektronikprodukt ADD COLUMN IF NOT EXISTS schutzklasse DECIMAL(4,2) UNSIGNED;
ALTER TABLE Elektronikprodukt ADD COLUMN IF NOT EXISTS stromverbrauch DECIMAL(4 ,2) UNSIGNED;
ALTER TABLE Elektronikprodukt ADD COLUMN IF NOT EXISTS leistung DECIMAL(4 ,2) UNSIGNED;
ALTER TABLE Elektronikprodukt ADD COLUMN IF NOT EXISTS anschlussart TINYTEXT UNSIGNED;
ALTER TABLE Elektronikprodukt ADD COLUMN IF NOT EXISTS garantieZeit DATE; -- Datum-Format muss YYY-MM-DD sein
ALTER TABLE Elektronikprodukt ADD COLUMN IF NOT EXISTS hatSchalter BOOLEAN;
ALTER TABLE Elektronikprodukt ADD COLUMN IF NOT EXISTS netzwerkfaehig BOOLEAN;
ALTER TABLE Elektronikprodukt ADD COLUMN IF NOT EXISTS anzahlSignalleuchten TINYINT;
