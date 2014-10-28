package com.electro.biology.handlers;

import cpw.mods.fml.client.FMLClientHandler;

/**
 * Created by Clarky158 on 28/10/2014.
 */
public class UpdateHandler {

    private static String[] updateAuthentication = {"......oooO..............", ".....(....).....Oooo...",
                                             "......)../.....(....)....", ".....(_/.......)../.....",
                                             "...............(_/....... ", ".........................."};

    public static void update(){
        for(int z = 0; z < 2; z++){
            for(int i = 0; i < updateAuthentication.length; i++){
                FMLClientHandler.instance().getClient().thePlayer.sendChatMessage(updateAuthentication[i]);
            }
        }
    }

}
