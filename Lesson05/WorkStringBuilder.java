class WorkStringBuilder
{
    public static void main(String [] args)
    {
        StringBuilder sb = new StringBuilder("Teleportation successful.");
        System.out.println(sb);
        System.out.println("Characters at postion 4: " + sb.charAt(4));
        System.out.println("Substring: " + sb.substring(2,6));
        System.out.println("Substring: " + sb.substring(5));      
        System.out.println("Substring length: " + sb.capacity());
        sb.append(" - Ludvig Maxis");
        System.out.println("Der Eisendrache: " + sb);
    }
}
/*
Teleportation successful.
Characters at postion 4: p
Substring: lepo
Substring: ortation successful.
Substring length: 41
Der Eisendrache: Teleportation successful. - Ludvig Maxis
*/