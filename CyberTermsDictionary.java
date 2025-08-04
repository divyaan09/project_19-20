import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CyberTermsDictionary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        // Sample cybersecurity terms and definitions
        dictionary.put("phishing", "A method of tricking users into revealing sensitive information through fake emails or websites.");
        dictionary.put("malware", "Software designed to harm, exploit, or otherwise compromise a device or network.");
        dictionary.put("firewall", "A security system that monitors and controls incoming and outgoing network traffic.");
        dictionary.put("encryption", "The process of converting data into a coded format to prevent unauthorized access.");
        dictionary.put("ransomware", "A type of malware that encrypts files and demands payment for decryption.");
        dictionary.put("vpn", "Virtual Private Network – encrypts internet traffic and masks your IP address.");
        dictionary.put("dos", "Denial of Service – an attack that floods a server to make it unavailable.");
        dictionary.put("brute force", "A trial-and-error method used to decode encrypted data such as passwords.");
        dictionary.put("hashing", "A one-way function that converts data into a fixed-size string of characters.");
        dictionary.put("2fa", "Two-Factor Authentication – adds an extra layer of security by requiring a second form of verification.");
        dictionary.put("spyware", "Software that secretly gathers user information without consent.");
        dictionary.put("trojan", "A type of malware disguised as legitimate software to trick users.");
        dictionary.put("worm", "A standalone malware that replicates itself to spread across networks.");
        dictionary.put("rootkit", "Malicious software that hides its presence and gives attackers root access.");
        dictionary.put("botnet", "A network of infected devices controlled by an attacker for coordinated attacks.");
        dictionary.put("zero-day", "A vulnerability that is unknown to the vendor and has no patch available.");
        dictionary.put("social engineering", "Manipulating people into revealing confidential information.");
        dictionary.put("exploit", "A method or code that takes advantage of a vulnerability in a system.");
        dictionary.put("backdoor", "A hidden method to bypass normal authentication and gain access to a system.");
        dictionary.put("sql injection", "An attack that injects malicious SQL code into a database query.");
        dictionary.put("xss", "Cross-Site Scripting – injecting malicious scripts into web pages viewed by others.");
        dictionary.put("authentication", "The process of verifying the identity of a user or device.");
        dictionary.put("authorization", "The process of granting access to resources after authentication.");
        dictionary.put("session hijacking", "Taking control of a user's session to gain unauthorized access.");
        dictionary.put("man-in-the-middle", "An attacker secretly intercepts and relays messages between two parties.");
        dictionary.put("captcha", "A test used to determine whether the user is human or a bot.");
        dictionary.put("patch", "An update to software that fixes security vulnerabilities or bugs.");
        dictionary.put("data breach", "An incident where sensitive, protected data is accessed or disclosed.");
        dictionary.put("digital signature", "A cryptographic method to verify the authenticity and integrity of data.");
        dictionary.put("public key", "A key used in encryption that is shared publicly and used to encrypt data.");
        dictionary.put("private key", "A secret key used to decrypt data encrypted with the corresponding public key.");
        dictionary.put("csrf", "Cross-Site Request Forgery – tricks users into performing actions they didn’t intend.");
        dictionary.put("honeypot", "A decoy system set up to attract attackers and study their behavior.");
        dictionary.put("dns spoofing", "An attack that redirects traffic from a legitimate site to a fake one.");
        dictionary.put("sandbox", "A secure environment used to test or analyze code safely.");
        dictionary.put("intrusion detection system", "A system that monitors network traffic for suspicious activity.");
        dictionary.put("intrusion prevention system", "A system that actively blocks or prevents detected threats.");
        dictionary.put("threat", "A potential cause of an unwanted incident that may harm a system or organization.");
        dictionary.put("vulnerability", "A weakness that can be exploited to compromise a system.");
        dictionary.put("risk", "The potential for loss or damage when a threat exploits a vulnerability.");
        dictionary.put("asset", "Anything valuable that needs protection (e.g., data, devices, systems).");
        dictionary.put("incident", "A security event that compromises the integrity, confidentiality, or availability of an asset.");
        dictionary.put("penetration testing", "An authorized simulated attack to evaluate the security of a system.");
        dictionary.put("forensics", "The process of collecting and analyzing digital evidence after a cyber incident.");
        dictionary.put("SIEM", "Security Information and Event Management – a system that aggregates and analyzes security data.");
        dictionary.put("keylogger", "Malware that records keystrokes to steal sensitive information.");
        dictionary.put("packet sniffing", "Capturing data packets from a network to analyze traffic.");
        dictionary.put("dns", "Domain Name System – translates domain names into IP addresses.");
        dictionary.put("ddos", "Distributed Denial of Service – an attack using multiple systems to overwhelm a target.");
        dictionary.put("endpoint", "Any device connected to a network (e.g., laptop, phone, server).");
        dictionary.put("security policy", "A set of rules and practices that govern how an organization protects its assets.");



        System.out.println("=== Cyber Terms Dictionary ===");
        System.out.println("Type a term to get its definition or type 'exit' to quit.\n");

        while (true) {
            System.out.print("Enter term: ");
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            } else if (dictionary.containsKey(input)) {
                System.out.println("Definition: " + dictionary.get(input) + "\n");
            } else {
                System.out.println("Sorry, term not found. Try another.\n");
            }
        }

        scanner.close();
    }
}
