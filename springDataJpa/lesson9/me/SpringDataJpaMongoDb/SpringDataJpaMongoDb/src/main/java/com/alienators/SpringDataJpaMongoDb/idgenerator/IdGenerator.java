package com.alienators.SpringDataJpaMongoDb.idgenerator;

import java.util.UUID;

public class IdGenerator 
{
    public static String generateId() 
    {
        return UUID.randomUUID().toString().replace("-","").substring(0,10);
    }

}
