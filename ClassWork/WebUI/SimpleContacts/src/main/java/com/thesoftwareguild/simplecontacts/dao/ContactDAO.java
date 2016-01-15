/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.simplecontacts.dao;

/**
 *
 * @author apprentice
 */

import com.thesoftwareguild.simplecontacts.dto.Contact;
import java.util.List;

public interface ContactDAO {
    List<Contact> getContact();

}
