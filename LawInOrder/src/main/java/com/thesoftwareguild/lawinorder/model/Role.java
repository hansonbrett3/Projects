/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.lawinorder.model;

import java.util.Objects;

/**
 *
 * @author apprentice
 */
public class Role {
    private int roleId;
    private String roleName;

    public int getRoleId() {
        return roleId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.roleId;
        hash = 83 * hash + Objects.hashCode(this.roleName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Role other = (Role) obj;
        if (this.roleId != other.roleId) {
            return false;
        }
        if (!Objects.equals(this.roleName, other.roleName)) {
            return false;
        }
        return true;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}