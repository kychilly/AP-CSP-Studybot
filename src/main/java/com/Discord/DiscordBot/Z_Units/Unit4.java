package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit4Questions;

public class Unit4 {

    public static int numUnit4Questions;

    public static void initializeUnit4Questions() {

        unit4Questions.add(new Question(
                "Which of the following is the primary function of the CPU?",
                "Store data permanently", "Perform arithmetic and logic operations", "Manage network connections", "Display graphics",
                "B", 4, 3000, "easy"));

        unit4Questions.add(new Question(
                "Which of the following best describes RAM?",
                "Permanent storage for files", "Temporary memory used by programs during execution", "A type of network protocol", "A graphics processing unit",
                "B", 4, 3001, "easy"));

        unit4Questions.add(new Question(
                "Which of these is an example of an input device?",
                "Monitor", "Keyboard", "Printer", "Speaker",
                "B", 4, 3002, "easy"));

        unit4Questions.add(new Question(
                "Which of the following is a function of an operating system?",
                "Manage hardware resources and provide a user interface", "Design computer networks", "Encrypt files", "Compile code into assembly",
                "A", 4, 3003, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes a server?",
                "A computer that provides resources or services to other computers on a network", "A personal gaming computer", "A device that connects to Wi-Fi", "A handheld device",
                "A", 4, 3004, "medium"));

        unit4Questions.add(new Question(
                "Which of these is a characteristic of solid-state drives (SSD) compared to hard disk drives (HDD)?",
                "Faster access time and no moving parts", "Slower and cheaper", "Uses magnetic disks to store data", "Cannot store large files",
                "A", 4, 3005, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes a LAN (Local Area Network)?",
                "A network confined to a small geographic area such as a building", "A worldwide network connecting millions of devices", "A network connecting two devices via Bluetooth", "A satellite network",
                "A", 4, 3006, "easy"));

        unit4Questions.add(new Question(
                "Which protocol is primarily used to transfer web pages over the internet?",
                "FTP", "HTTP", "SMTP", "TCP",
                "B", 4, 3007, "easy"));

        unit4Questions.add(new Question(
                "Which of the following best describes the function of DNS (Domain Name System)?",
                "Translate domain names into IP addresses", "Encrypt network traffic", "Store web page content", "Send emails",
                "A", 4, 3008, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is an advantage of using packet switching in networks?",
                "Efficient use of bandwidth and robustness against failures", "Requires dedicated circuits", "Slower than circuit switching", "Cannot handle multiple users",
                "A", 4, 3009, "medium"));

        unit4Questions.add(new Question(
                "Which of these is an example of a wireless network?",
                "Wi-Fi", "Ethernet cable", "Fiber-optic cable", "USB connection",
                "A", 4, 3010, "easy"));

        unit4Questions.add(new Question(
                "Which of the following best describes a firewall?",
                "A security system that monitors and controls incoming and outgoing network traffic", "A type of computer virus", "A graphics processor", "A network cable type",
                "A", 4, 3011, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes the difference between IPv4 and IPv6?",
                "IPv6 uses longer addresses than IPv4 to allow more unique IP addresses", "IPv4 is faster than IPv6", "IPv6 cannot connect to the internet", "IPv4 uses encryption while IPv6 does not",
                "A", 4, 3012, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about client-server networks?",
                "Clients request services and the server provides them", "Clients control the server", "Servers request resources from clients", "All computers act as peers",
                "A", 4, 3013, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a protocol in networking?",
                "A set of rules that governs communication between devices", "A physical cable used to connect computers", "A type of processor", "A storage device",
                "A", 4, 3014, "easy"));

        unit4Questions.add(new Question(
                "Which of the following is an example of an input/output (I/O) device?",
                "Keyboard and monitor", "CPU and RAM", "Ethernet and router", "IP address and DNS",
                "A", 4, 3015, "easy"));

        unit4Questions.add(new Question(
                "Which of the following best describes cloud computing?",
                "Using remote servers hosted on the internet to store, manage, and process data", "Using only local storage", "Installing a new operating system", "Running offline applications",
                "A", 4, 3016, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is a common feature of peer-to-peer (P2P) networks?",
                "Each computer can act as both client and server", "There is a single central server", "Only one device can access the network at a time", "Requires cloud computing",
                "A", 4, 3017, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes latency in a network?",
                "The time it takes for data to travel from source to destination", "The amount of storage available on a server", "The total number of devices connected", "The number of errors in a file",
                "A", 4, 3018, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about encryption?",
                "It converts readable data into an unreadable format to protect it", "It deletes data permanently", "It speeds up network traffic", "It compresses files",
                "A", 4, 3019, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes bandwidth in a network?",
                "The maximum rate at which data can be transmitted", "The number of devices connected", "The distance between computers", "The size of a hard drive",
                "A", 4, 3020, "medium"));

        unit4Questions.add(new Question(
                "Which of these is an advantage of fiber-optic cables over copper cables?",
                "Higher speed and longer distance with less signal loss", "Cheaper to install", "Easier to bend and route", "Consumes less electricity",
                "A", 4, 3021, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes a MAC address?",
                "A unique identifier assigned to a network interface card", "An IP address assigned by the ISP", "A type of network protocol", "A security key for encryption",
                "A", 4, 3022, "medium"));

        unit4Questions.add(new Question(
                "Which of these is true about TCP/IP?",
                "It is a suite of communication protocols used for the internet", "It is a type of encryption algorithm", "It is a physical network cable", "It is an operating system",
                "A", 4, 3023, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is a characteristic of packet-switched networks?",
                "Data is broken into packets and can take multiple paths to the destination", "Data travels in a single dedicated path", "It only works with LANs", "It cannot handle large networks",
                "A", 4, 3024, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes a router?",
                "A device that directs network traffic between different networks", "A device that stores files", "A type of processor", "A wireless input device",
                "A", 4, 3025, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a switch in networking?",
                "A device that connects multiple devices on the same network and forwards data selectively", "A device that encrypts data", "A computer monitor", "A type of cloud storage",
                "A", 4, 3026, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about network topologies?",
                "They describe the layout and structure of connected devices", "They are always physical maps", "They store encryption keys", "They determine processor speed",
                "A", 4, 3027, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a peer-to-peer (P2P) network?",
                "Each computer can act as both client and server", "There is a dedicated server for all clients", "It uses only fiber-optic cables", "It requires cloud computing",
                "A", 4, 3028, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes latency in a network?",
                "The delay between sending and receiving data", "The number of devices connected", "The total bandwidth available", "The amount of RAM in a server",
                "A", 4, 3029, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is an example of an ISP (Internet Service Provider)?",
                "Comcast", "Intel", "Microsoft", "Cisco",
                "A", 4, 3030, "easy"));

        unit4Questions.add(new Question(
                "Which of these best describes a VPN (Virtual Private Network)?",
                "A secure connection that encrypts data between a user and a network", "A public Wi-Fi network", "A type of computer processor", "A cloud storage service",
                "A", 4, 3031, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes an IP address?",
                "A unique numerical identifier for a device on a network", "A password for a server", "A type of network cable", "An encryption key",
                "A", 4, 3032, "easy"));

        unit4Questions.add(new Question(
                "Which of these best describes a subnet mask?",
                "It determines which portion of an IP address identifies the network and which identifies the host", "It encrypts IP addresses", "It stores MAC addresses", "It is a type of router",
                "A", 4, 3033, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about the difference between public and private IP addresses?",
                "Public IP addresses are globally unique; private IP addresses are used within local networks", "Private IP addresses are always faster", "Public IP addresses cannot access the internet", "Private IP addresses are assigned by ISPs",
                "A", 4, 3034, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes network redundancy?",
                "Having multiple paths for data to prevent network failure", "Using only one cable per connection", "A backup power supply", "Storing files in the cloud",
                "A", 4, 3035, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is an advantage of using cloud-based servers?",
                "Scalability and remote access to resources", "Guaranteed faster local speed", "No need for any internet connection", "Free hardware for clients",
                "A", 4, 3036, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes network congestion?",
                "Too much data traffic causing delays or packet loss", "A computer virus", "Encryption of packets", "A physical network cable malfunction",
                "A", 4, 3037, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about the difference between IPv4 and IPv6 addresses?",
                "IPv6 allows for a larger number of unique addresses than IPv4", "IPv4 is encrypted, IPv6 is not", "IPv6 is only used in LANs", "IPv4 addresses are longer than IPv6 addresses",
                "A", 4, 3038, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is an example of a network protocol for email?",
                "SMTP", "HTTP", "FTP", "DNS",
                "A", 4, 3039, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes a Denial-of-Service (DoS) attack?",
                "An attack that overwhelms a network or server to make it unavailable", "A virus that deletes files", "A firewall configuration", "An encryption method",
                "A", 4, 3040, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is a common method for securing data during transmission?",
                "Encryption", "Defragmentation", "Compression", "Caching",
                "A", 4, 3041, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes two-factor authentication (2FA)?",
                "Requiring two forms of verification to access an account", "Logging in from two devices simultaneously", "Using two passwords", "Encrypting a password twice",
                "A", 4, 3042, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes phishing?",
                "A technique used to trick users into revealing sensitive information", "A type of network cable", "A cloud storage service", "A firewall configuration",
                "A", 4, 3043, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is a primary function of a proxy server?",
                "Act as an intermediary between clients and other servers for security and caching", "Store permanent files", "Encrypt emails", "Provide RAM for clients",
                "A", 4, 3044, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes HTTPS?",
                "HTTP with encryption using SSL/TLS", "A faster version of HTTP", "A type of IP address", "A network cable",
                "A", 4, 3045, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes a VPN tunnel?",
                "An encrypted connection between a client and a network", "A physical cable connecting two networks", "A type of cloud server", "A router configuration",
                "A", 4, 3046, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about malware?",
                "It is software designed to harm or exploit systems", "It speeds up network traffic", "It compresses files automatically", "It is a type of router",
                "A", 4, 3047, "medium"));

        unit4Questions.add(new Question(
                "Which of these is a function of a network router?",
                "Forward data packets between different networks", "Encrypt files on a server", "Store files permanently", "Generate IP addresses for a single device",
                "A", 4, 3048, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes NAT (Network Address Translation)?",
                "A method to allow multiple devices on a local network to share a single public IP address", "A type of virus", "A cloud server", "An operating system process",
                "A", 4, 3049, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about symmetric encryption?",
                "The same key is used to encrypt and decrypt data", "Different keys are used for encryption and decryption", "It cannot secure email", "It compresses data",
                "A", 4, 3050, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes asymmetric encryption?",
                "Uses a public key to encrypt and a private key to decrypt data", "Encrypts data twice with the same key", "Compresses network traffic", "Stores IP addresses securely",
                "A", 4, 3051, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is a characteristic of a secure password?",
                "Contains a mix of letters, numbers, and symbols", "Uses only letters", "Uses only numbers", "Matches your username",
                "A", 4, 3052, "easy"));

        unit4Questions.add(new Question(
                "Which of the following best describes a botnet?",
                "A network of compromised computers controlled by an attacker", "A network of cloud servers", "A local area network in a school", "A type of encryption protocol",
                "A", 4, 3053, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes SSL/TLS?",
                "Protocols that encrypt data transmitted over networks", "File storage formats", "A type of firewall", "A network topology",
                "A", 4, 3054, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a man-in-the-middle attack?",
                "An attack where the attacker intercepts and possibly alters communication between two parties", "A DDoS attack", "A firewall configuration", "A cloud backup",
                "A", 4, 3055, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about two computers using the same MAC address on the same network?",
                "It can cause address conflicts and network issues", "It is required for VPNs", "It improves network speed", "It prevents malware",
                "A", 4, 3056, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes network sniffing?",
                "Capturing and analyzing network traffic, often maliciously", "A method of encryption", "A firewall configuration", "A cloud storage technique",
                "A", 4, 3057, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes a DMZ (demilitarized zone) in networking?",
                "A separate network segment that exposes public services while protecting internal networks", "A cloud server cluster", "A VPN tunnel", "An encryption method",
                "A", 4, 3058, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about network redundancy and failover?",
                "It provides backup paths and systems to maintain connectivity in case of failure", "It compresses network traffic", "It encrypts IP addresses", "It slows down routers intentionally",
                "A", 4, 3059, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes a load balancer?",
                "A device or software that distributes network traffic across multiple servers", "A firewall that blocks traffic", "A router for LANs", "A VPN gateway",
                "A", 4, 3060, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about cloud redundancy?",
                "It stores copies of data across multiple locations to prevent loss", "It compresses files to save space", "It encrypts files automatically", "It reduces internet latency",
                "A", 4, 3061, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes edge computing?",
                "Processing data closer to the source or user to reduce latency", "Storing all data in a central cloud server", "Encrypting files locally", "Compressing network traffic",
                "A", 4, 3062, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is a benefit of virtualization in computer systems?",
                "Running multiple virtual machines on a single physical server", "Increasing RAM in a computer", "Replacing physical disks with SSDs", "Encrypting all data automatically",
                "A", 4, 3063, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a hypervisor?",
                "Software that creates and manages virtual machines", "A network protocol", "A firewall configuration", "A type of cloud server",
                "A", 4, 3064, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about distributed denial-of-service (DDoS) attacks?",
                "They use multiple compromised devices to overwhelm a target network", "They encrypt data for security", "They reduce network latency", "They improve server performance",
                "A", 4, 3065, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes cloud storage?",
                "Storing data on remote servers accessible via the internet", "Using local hard drives only", "Encrypting files on a local computer", "Compressing files for faster access",
                "A", 4, 3066, "easy"));

        unit4Questions.add(new Question(
                "Which of the following is a characteristic of a content delivery network (CDN)?",
                "Distributes copies of content across multiple geographic locations to reduce latency", "Stores all data in one server", "Encrypts files automatically", "Monitors local traffic only",
                "A", 4, 3067, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about network monitoring?",
                "It tracks performance, availability, and security of network resources", "It compresses network packets", "It automatically fixes hardware issues", "It encrypts data in transit",
                "A", 4, 3068, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a man-in-the-browser attack?",
                "Malware intercepts and modifies data in a web browser session", "A phishing email", "A VPN failure", "A firewall configuration",
                "A", 4, 3069, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about intrusion detection systems (IDS)?",
                "They monitor networks for suspicious activity and potential attacks", "They encrypt all network traffic", "They act as a cloud storage solution", "They compress data for faster transmission",
                "A", 4, 3070, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes Quality of Service (QoS) in networking?",
                "Prioritizing certain types of network traffic to ensure performance", "Encrypting traffic", "Compressing packets", "Blocking malware automatically",
                "A", 4, 3071, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes a sandbox in cybersecurity?",
                "An isolated environment to safely run and test untrusted programs", "A virtual private network", "A firewall setting", "A network router",
                "A", 4, 3072, "medium"));

        unit4Questions.add(new Question(
                "Which of these is true about network segmentation?",
                "Dividing a network into smaller segments to improve performance and security", "Merging multiple networks into one", "Encrypting network traffic", "Disabling unused ports",
                "A", 4, 3073, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes zero-trust security?",
                "All devices and users must be verified before gaining network access", "Devices inside a network are automatically trusted", "Encryption is optional", "Firewall rules are unnecessary",
                "A", 4, 3074, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about network address exhaustion?",
                "Running out of available IP addresses in a network", "Too many users connected to Wi-Fi", "Excessive encryption slowing the network", "Server storage full",
                "A", 4, 3075, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes network load testing?",
                "Simulating high traffic to assess network performance under stress", "Measuring latency between two devices", "Encrypting all network packets", "Setting up a VPN",
                "A", 4, 3076, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about NAT traversal techniques?",
                "They allow devices behind NAT to communicate with external networks", "They encrypt all traffic", "They store IP addresses permanently", "They compress network packets",
                "A", 4, 3077, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes software-defined networking (SDN)?",
                "Network control is separated from hardware and managed programmatically", "All routing is done manually", "Traffic is always encrypted", "It requires cloud servers only",
                "A", 4, 3078, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about cloud orchestration?",
                "Automates deployment, management, and coordination of cloud resources", "Encrypts all cloud data automatically", "Manually distributes files across servers", "Monitors only local traffic",
                "A", 4, 3079, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes the Internet of Things (IoT)?",
                "A network of physical devices connected to the internet that collect and exchange data", "A type of cloud storage", "A firewall configuration", "A virtual machine",
                "A", 4, 3080, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about network troubleshooting?",
                "It identifies and resolves issues that affect network performance or connectivity", "It automatically upgrades routers", "It compresses all network traffic", "It encrypts IP addresses",
                "A", 4, 3081, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes packet loss?",
                "When some data packets fail to reach their destination", "When data is encrypted incorrectly", "When network cables are redundant", "When multiple IP addresses exist",
                "A", 4, 3082, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about jitter in networking?",
                "It refers to variations in packet arrival times that can affect real-time applications", "It is a type of virus", "It encrypts data", "It compresses packets",
                "A", 4, 3083, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a proxy server used for content filtering?",
                "It blocks or allows access to specific websites or content types", "It stores emails locally", "It encrypts network traffic automatically", "It compresses files for storage",
                "A", 4, 3084, "medium"));

        unit4Questions.add(new Question(
                "Which of the following best describes network sniffing tools?",
                "Software or hardware used to capture and analyze network traffic", "Firewalls that block malware", "Virtual machines for cloud computing", "Protocols for email transmission",
                "A", 4, 3085, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a brute-force attack?",
                "An attempt to guess passwords by trying all possible combinations", "Intercepting network traffic", "Encrypting data for security", "Using a firewall to block connections",
                "A", 4, 3086, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about network segmentation for security?",
                "It limits access and potential damage if a network segment is compromised", "It merges multiple networks", "It encrypts all traffic automatically", "It increases IP address exhaustion",
                "A", 4, 3087, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a honeypot in cybersecurity?",
                "A decoy system designed to attract and study attackers", "A type of cloud storage", "A firewall configuration", "An encrypted backup",
                "A", 4, 3088, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about the difference between 2G, 3G, 4G, and 5G networks?",
                "They represent successive generations of mobile network technology with increasing speed and bandwidth", "They are types of IP addresses", "They are cloud storage protocols", "They encrypt all wireless traffic",
                "A", 4, 3089, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes latency-sensitive applications?",
                "Applications that require minimal delay for proper performance, such as video conferencing", "Applications that compress files automatically", "Applications that encrypt data only", "Applications that use cloud storage",
                "A", 4, 3090, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about network throughput?",
                "It measures the actual rate of successful data transfer over a network", "It is always equal to bandwidth", "It encrypts data automatically", "It compresses files for transmission",
                "A", 4, 3091, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a certificate authority (CA)?",
                "An organization that issues digital certificates to verify identities online", "A firewall rule set", "A cloud server", "A network switch",
                "A", 4, 3092, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about network virtualization?",
                "It allows multiple virtual networks to run on a single physical network", "It encrypts all packets automatically", "It compresses network traffic", "It requires physical segmentation only",
                "A", 4, 3093, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes bandwidth throttling?",
                "Deliberately slowing down network speed for certain users or applications", "Encrypting all network traffic", "Blocking IP addresses", "Merging multiple LANs",
                "A", 4, 3094, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about mesh networks?",
                "All nodes can communicate directly, dynamically, and non-hierarchically", "There is a single central server", "Nodes cannot communicate directly", "They are always wired networks",
                "A", 4, 3095, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a zero-day vulnerability?",
                "A security flaw that is unknown to those who should fix it and can be exploited by attackers", "A firewall misconfiguration", "An encrypted packet loss", "A cloud server outage",
                "A", 4, 3096, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about multi-factor authentication (MFA)?",
                "It requires two or more forms of verification to access an account", "It only requires a username and password", "It encrypts all files automatically", "It reduces bandwidth usage",
                "A", 4, 3097, "medium"));

        unit4Questions.add(new Question(
                "Which of these best describes a software patch?",
                "An update to fix security vulnerabilities or improve functionality", "A type of firewall", "A network topology", "A virtual machine",
                "A", 4, 3098, "medium"));

        unit4Questions.add(new Question(
                "Which of the following is true about network intrusion prevention systems (IPS)?",
                "They actively monitor and block malicious activity on a network", "They compress all network packets", "They act as cloud storage", "They only log traffic without action",
                "A", 4, 3099, "medium"));



        numUnit4Questions = unit4Questions.size();
        System.out.printf("There are %d questions in unit 4%n", numUnit4Questions);

    }

}
