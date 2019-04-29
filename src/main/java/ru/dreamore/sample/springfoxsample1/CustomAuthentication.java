package ru.dreamore.sample.springfoxsample1;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.HashSet;

@ToString
@Builder
public class CustomAuthentication implements Authentication {

    @Setter
    private AuthenticationDetails details;

    private String sessionCookie;

    private boolean authenticated;

    @Override
    public String getName() {
        return details.getUser().getSecurityUserId();
    }

    @Override
    public Object getCredentials() {
        return sessionCookie;
    }

    @Override
    public Object getPrincipal() {
        return details.getUser().getSecurityUserId();
    }

    @Override
    public AuthenticationDetails getDetails() {
        return details;
    }

    @Override
    public boolean isAuthenticated() {
        return authenticated;
    }


    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException { // NOSONAR
        authenticated = isAuthenticated;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new HashSet<GrantedAuthority>() {{
            add(() -> "SOME_USER");
        }};
    }
}
