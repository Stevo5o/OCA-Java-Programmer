class WorkStringBuilder
{
    public static void main(String [] args)
    {
        StringBuilder sb = new StringBuilder("Teleportation successful.");
        StringBuilder sb1 = new StringBuilder("Landing pad activated");
        System.out.println(sb);
        System.out.println(sb1 + " " + sb1.length());
        System.out.println("Characters at postion 4: " + sb.charAt(4));
        System.out.println("Substring: " + sb.substring(2,6));
        System.out.println("Substring: " + sb.substring(5));      
        System.out.println("Length: " + sb.capacity());
        sb.append(" - Ludvig Maxis");
        System.out.println("Der Eisendrache: " + sb);
        sb.setCharAt(24,'!');
        sb.insert(0,"Der Eisendrache: ");
        System.out.println(sb);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        System.out.println(sb1.reverse());
    }
}
/*
Teleportation successful.
Landing pad activated 21
Characters at postion 4: p
Substring: lepo
Substring: ortation successful.
Length: 41
Der Eisendrache: Teleportation successful. - Ludvig Maxis
Der Eisendrache: Teleportation successful! - Ludvig Maxis
Capacity: 84
Length: 57
*/