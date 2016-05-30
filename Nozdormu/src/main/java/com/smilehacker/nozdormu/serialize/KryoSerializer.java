package com.smilehacker.nozdormu.serialize;

import com.esotericsoftware.kryo.Kryo;

import java.io.ByteArrayOutputStream;

/**
 * Created by kleist on 16/5/30.
 */
public class KryoSerializer implements Serializer {

    public void foo() {
        Kryo kryo = new Kryo();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    }
}
