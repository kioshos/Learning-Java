package org.example;

import Task_1.FilePathComparator;
import Task_2.FirbiddenWordManager;
import Task_4.CreateCopyOfFilesHandler;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String sourcePath = "FilesToCheck";

        FirbiddenWordManager manager = new FirbiddenWordManager();

        manager.readFilesInDirectory(sourcePath);

    }
}