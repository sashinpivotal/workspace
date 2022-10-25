/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.lp.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class DirectHttpRequestDemo {

    /*
     * It's really cheap to 'throws Exception' from main(),
     * and no real code should ever do this, but here we just don't care.
     */
    public static void main(String[] args) throws Exception {
        String host = "learningpatterns.com";

        try (Socket socket = new Socket(host, 80);  // host, port
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  // autoflush
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            /*
             * Send a raw HTTP GET request to server, get response back.
             * NOTE: the server may return HTTP 301, 302, 400, etc.,
             * possibly due to https, redirects, etc.
             * It still shows us that the data transmission works.
             */
            StringBuilder request = new StringBuilder();
            request.append("GET / HTTP/1.1\r\n");
            request.append("Host: " + host + "\r\n");
            request.append("User-Agent: IntelliJ\r\n");

            System.out.println("*** Sending HTTP request ***");
            System.out.println(request);
            out.println(request);  // over the network it goes!

            System.out.println("*** Reading HTTP response ***");
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}