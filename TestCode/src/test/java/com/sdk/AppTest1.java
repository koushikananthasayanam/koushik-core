package com.sdk;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by AnubhaKoushik on 9/27/15.
 */
public class AppTest1 {

    @Test
    public void getMovieListTest(){

        String actor1 = "John Travolta";
        String actor2 = "ChrisNolan";

        App app = new App();
        Assert.assertEquals("Face/Off", app.getMovieName(actor1));
        Assert.assertEquals("Interstellar",app.getMovieName(actor2));

    }


}
