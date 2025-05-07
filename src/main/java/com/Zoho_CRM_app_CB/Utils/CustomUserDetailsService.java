package com.Zoho_CRM_app_CB.Utils;



import com.Zoho_CRM_app_CB.Entity.Lead;
import com.Zoho_CRM_app_CB.Repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private LeadRepository leadRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Lead lead = leadRepository.findByEmail(email);
        
        if (lead == null) {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }

        return new CustomUserDetails(lead); // Wrap the Lead entity with CustomUserDetails
    }
}
