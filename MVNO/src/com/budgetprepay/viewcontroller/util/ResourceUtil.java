package com.budgetprepay.viewcontroller.util;

import java.util.ResourceBundle;

public class ResourceUtil 
{
   private static ResourceBundle rb = ResourceBundle.getBundle("Configuration");
   
   private static ResourceBundle get() {
	   return rb; 
   }
   
   public static String get(final String key) {
	   return get().getString(key);
   }
   
   public static int test() {
	   return rb.keySet().size();
   }
}
