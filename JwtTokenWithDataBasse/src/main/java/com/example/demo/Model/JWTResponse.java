package com.example.demo.Model;



public class JWTResponse {

    private String jwtToken;
    private String userName;

    // Private Constructor (Only accessible via the Builder)
    private JWTResponse(Builder builder) {
        this.jwtToken = builder.jwtToken;
        this.userName = builder.userName;
    }

    // Getters
    public String getJwtToken() {
        return jwtToken;
    }

    public String getUserName() {
        return userName;
    }

    // Builder Class
    public static class Builder {
        private String jwtToken;
        private String userName;

        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public Builder username(String userName) {  // Fixed method name to match usage
            this.userName = userName;
            return this;
        }

        public JWTResponse build() {
            return new JWTResponse(this);
        }
    }

    // Static method to return a new Builder instance
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "JWTResponse{" +
                "jwtToken='" + jwtToken + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
