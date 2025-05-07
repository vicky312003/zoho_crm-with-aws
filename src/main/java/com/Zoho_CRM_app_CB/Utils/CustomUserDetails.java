package com.Zoho_CRM_app_CB.Utils;



import com.Zoho_CRM_app_CB.Entity.Lead;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class CustomUserDetails implements UserDetails {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Lead lead;

    public CustomUserDetails(Lead lead) {
        this.lead = lead;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(lead.getRole())); // Assign role from the Lead entity
    }

    @Override
    public String getPassword() {
        return lead.getPassword();
    }

    @Override
    public String getUsername() {
        return lead.getEmail();  // Use email as the username
    }

    @Override public boolean isAccountNonExpired() { return true; }
    @Override public boolean isAccountNonLocked() { return true; }
    @Override public boolean isCredentialsNonExpired() { return true; }
    @Override public boolean isEnabled() { return true; }
}
