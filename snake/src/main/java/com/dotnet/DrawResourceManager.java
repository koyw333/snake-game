package com.dotnet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrawResourceManager   {
    private List<DrawResource> drawResources;
    public DrawResourceManager(){
        drawResources = new ArrayList<>();
    }

    public void addDrawResource(DrawResource resource){
        drawResources.add(resource);
    }

    public DrawResource[] getDrawResources(){
        DrawResource[] temp= new DrawResource[drawResources.size()];
        return drawResources.toArray(temp);
    }


    public void addDrawResource(DrawResource[] bodyResource) {
        drawResources.addAll(Arrays.asList(bodyResource));
    }

    public void addDrawResource(List<DrawResource> drawResource) {
        drawResources.addAll(drawResource);
    }
}
