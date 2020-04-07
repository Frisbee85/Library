package pl.javastart.library.IO.file;

import pl.javastart.library.exception.DataExportException;
import pl.javastart.library.exception.DataImportException;
import pl.javastart.library.model.Library;

import java.io.*;

public class SerializableFileManager implements FileManager {
    private static final String FILE_NAME = "Library.o";


    @Override
    public void exportData(Library library) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOutputStreamo = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStreamo.writeObject(library);
        } catch (FileNotFoundException e) {
            throw new DataExportException("Brak pliku: " + FILE_NAME);
        } catch (IOException e) {
            throw new DataExportException("Błąd zapisu danych do pliku: " + FILE_NAME);
        }
    }

    @Override
    public Library importData() {
        try (
                FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            return (Library) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new DataImportException("Brak pliku: " + FILE_NAME);
        } catch (IOException e) {
            throw new DataImportException("Brak odczytu pliku: " + FILE_NAME);
        } catch (ClassNotFoundException e) {
            throw new DataImportException("Niezgodny typ danych w pliku: " + FILE_NAME);
        }
    }
}
