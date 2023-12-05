package com.example.restaurant.Entity;

import com.example.restaurant.Model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class UserPrinciple implements UserDetails {

    private User user;

    @Autowired
    public UserPrinciple(User user){
        this.user=user;

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority>authorities=new ArrayList<>();
        user.getAuthorities().forEach(temp->{
            GrantedAuthority grantedAuthority=new SimpleGrantedAuthority(temp.getRoleName());
            authorities.add(grantedAuthority);
                });
        return authorities;
    }

    @Override
    public String getPassword() {
return user.getPassword();
    }

    @Override
    public String getUsername() {
       return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getActive()==1;
    }
}
