public class ThreadIdentifier 
{
    public static long getThreadId()
    {
        Thread t = Thread.currentThread();
        return t.getId();
    }
    public static String getThreadSignature()
    {
        Thread t = Thread.currentThread();
        long l = t.getId();
        String name = t.getName();
        long p = t.getPriority();
        String group = t.getThreadGroup().getName();
        return l + ":" + name + ":" + p + ":" + group;
    }
    public static void logThreadSignature(String tag)
    {
        System.out.println(tag + " " + getThreadSignature());
    }
    public static void sleepForSeconds(int secs)
    {
        try
        {
            Thread.sleep(secs * 1000);
        }
        catch(InterruptedException x)
        {
            throw new RuntimeException(x);
        }
    }
}
