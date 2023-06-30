package com.juaracoding.hajavafundamental.cobacoba;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 6/30/2023 8:54 PM
@Last Modified 6/30/2023 8:54 PM
Version 1.0
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FungsiRandom {

    public static void main(String[] args) {
        String[] providers = {"gmail", "yahooo", "rocketmail"};
        String[] domains = {".id", ".co.id", ".com"};

        for(String email: emailRandomizer('a', 'z', providers, domains, 10)){
            System.out.println(email);
        }
    }
    /**
     * Return list of randomized email
     * @return list of string email
     * @param beginChar char int to begin random
     * @param endChar char int to end char in randomizer
     * @param providers array of provider's names
     * @param domains array of domain's name
     * @param n tell how many data to generate
     * */
    public static List<String> emailRandomizer(int beginChar, int endChar, String[] providers, String[] domains, int n) {
        var results = new ArrayList<String>();
        var random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.setLength(0);
            int length = random.nextInt(8, 21);
            int providerIndex = random.nextInt(0, providers.length);
            int domainIndex = random.nextInt(0, domains.length);

            //Generate random username
            for(int j=0; j<length; j++){
                char tmp = (char) random.nextInt(beginChar, endChar);
                sb.append(tmp);
            }
            sb.append("@");
            sb.append(providers[providerIndex]);
            sb.append(domains[domainIndex]);
            results.add(sb.toString());
        }

        return results;
    }
}
