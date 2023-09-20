public class OAuthVsJWTExplanation {
    public static void main(String[] args) {
        System.out.println("OAuth2 vs. JWT Documentation Explanation");
        System.out.println("---------------------------------------");
        
        // Explanation of OAuth2
        System.out.println("OAuth2:");
        System.out.println("OAuth2 is an authorization framework that allows third-party applications to obtain limited access to a user's resources without exposing their credentials.");
        System.out.println("It provides a secure and standardized way for applications to request access on behalf of a user.");
        System.out.println("OAuth2 involves interactions between three main parties: the client, the resource owner, and the authorization server.");
        System.out.println("For detailed information, refer to the OAuth2 documentation.");
        System.out.println();
        
        // Explanation of JWT
        System.out.println("JWT (JSON Web Tokens):");
        System.out.println("JWT is a compact, URL-safe means of representing claims to be transferred between two parties.");
        System.out.println("It is often used for authentication and information exchange in a compact, self-contained format.");
        System.out.println("JWTs are digitally signed, ensuring that the information can be verified and trusted.");
        System.out.println("They consist of three parts: header, payload, and signature.");
        System.out.println("For detailed information, refer to the JWT documentation.");
    }
}