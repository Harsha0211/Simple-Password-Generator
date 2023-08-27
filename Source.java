package PasswordAssist;

class Source
{
    final private String upperChars = "QWERTYUIOPASDFGHJKLZXCVBNM";
    final private String lowerChars = "qwertyuiopasdfghjklzxcvbnm";
    final private String numbers = "1234567890";
    final private String symbols = "@#$%&_-!";

    

    public StringBuilder setPool(boolean includeUpper,boolean includeLower, boolean includeNums, boolean includeSyms)
    {
        StringBuilder pool = new StringBuilder("");
        if(includeUpper)
            pool.append(upperChars);
        if(includeLower)
            pool.append(lowerChars);
        if(includeNums)
            pool.append(numbers);
        if(includeSyms)
            pool.append(symbols);
        return pool;
    }
}