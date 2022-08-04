package com.innovactory.tranzer.client;

import javax.ws.rs.core.MediaType;

public class TranzerVersionUtil {

    public static final String VERSION = "4.7.0";

    public static final String API_PRODUCES = MediaType.APPLICATION_JSON + ";version=" + VERSION;
    public static final String API_CONSUMES = MediaType.APPLICATION_JSON + ";version=" + VERSION;
}
