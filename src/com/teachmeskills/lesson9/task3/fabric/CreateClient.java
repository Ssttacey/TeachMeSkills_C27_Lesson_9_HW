package com.teachmeskills.lesson9.task3.fabric;

import com.teachmeskills.lesson9.task3.model.client.Client;

/**
 * information about client. creating an object Client
 */

public class CreateClient {
    public static Client createClient() {
        Client cl1 = new Client("Ivan Ivanov ", "MC3458765", "31.07.1998", "Belarus", "Minsk, Serova Street, 18", CardFabric.createCards());
        return cl1;
    }
}

