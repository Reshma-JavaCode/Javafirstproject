package com.coding;

//// Real-Time POC – Downloading Multiple Files

//Imagine a file download application.
//We want to download three files independently.

class DownloadTask extends Thread {

    private String fileName;

    DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        System.out.println(fileName + " Download Started");

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                fileName + " - " + (i * 25) + "% Completed"
            );
        }

        System.out.println(fileName + " Download Completed");
    }
}

public class FileDownloadDemo {

    public static void main(String[] args) {

        DownloadTask t1 = new DownloadTask("Java.pdf");
        DownloadTask t2 = new DownloadTask("Spring.pdf");
        DownloadTask t3 = new DownloadTask("React.pdf");

        t1.start();
        t2.start();
        t3.start();
    }
}

