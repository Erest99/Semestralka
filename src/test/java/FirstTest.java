import org.junit.Assert;
import org.junit.Test;

public class FirstTest
{
    @Test
    public void anagramTest()
    {
        Anagram anagram = new Anagram();

        Assert.assertEquals(anagram.isAnagram("int","tin"),1);
        Assert.assertEquals(anagram.isAnagram("kaput","pika"),-1);
    }
}
