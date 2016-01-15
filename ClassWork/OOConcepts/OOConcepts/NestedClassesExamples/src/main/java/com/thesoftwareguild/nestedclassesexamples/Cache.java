/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.nestedclassesexamples;

/**
 *
 * @author apprentice
 */
public class Cache {
    
    public class CacheEntry
    {
        public long timeInserted = 0;
        public Object value = null;
    }
    
    private CacheEntry[] entries;
    private int index=0;
    
    public Cache(int size)
    {
        entries = new CacheEntry[size];
    }
    
    public int store (Object obj)
    {
        CacheEntry entry = new CacheEntry();
        entry.timeInserted = System.currentTimeMillis();
        entry.value = obj;
        entries[index] = entry;
        return ++index;
    }
    
    public Object get(int i)
    {
        if (i >= 0 && i<entries.length && entries[i] != null)
        {
            return entries[i].value;
        }
        return null;
    }
    
    public void retire()
    {
        for (int i=0; i<entries.length;i++)
        {
            if (entries[i] != null && 
                   (entries[i].timeInserted-System.currentTimeMillis()) > 6000)
            {
                entries[i] = null;
            }
            
          
                    
        }
    }
    
}
