/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    loadAddresses();
});

function loadAddresses() {

    clearAddressTable();

    var aTable = $('#contentRows');

    $.each(testAddressData, function (index, address) {
        aTable.append($('<tr>')
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-address-id': address.addressId,
                                    'data-toggle': 'modal',
                                    'data-target': '#detailsModal'
                                })
                                .text(address.first + ' ' + address.last)
                                )
                        )
                .append($('<td>').text(address.street))
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-address-id': address.addressId,
                                    'data-toggle': 'modal',
                                    'data-target': '#editModal'
                                })
                                .text('Edit')
                                )
                        )
                .append($('<td>').text('Delete'))
                );
    });

}

function clearAddressTable() {
    $('#contentRows').empty();
}

$('#detailsModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('address-id');
    var modal = $(this);
    modal.find('#address-id').text(dummyDetailsAddress.addressId);
    modal.find('#address-first').text(dummyDetailsAddress.first);
    modal.find('#address-last').text(dummyDetailsAddress.last);
    modal.find('#address-street').text(dummyDetailsAddress.street);
    modal.find('#address-city').text(dummyDetailsAddress.city);
    modal.find('#address-state').text(dummyDetailsAddress.state);
    modal.find('#address-zip').text(dummyDetailsAddress.zip);
});

$('#editModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('addressid');
    var modal = $(this);
    modal.find('#address-id').text(dummyEditAddress.addressId);
    modal.find('#edit-first').val(dummyEditAddress.first);
    modal.find('#edit-last').val(dummyEditAddress.last);
    modal.find('#edit-street').val(dummyEditAddress.street);
    modal.find('#edit-city').val(dummyEditAddress.city);
    modal.find('#edit-state').val(dummyEditAddress.state);
    modal.find('#edit-zip').val(dummyEditAddress.zip);
});

var testAddressData = [
    {
        addressId: 1,
        first: "Jane",
        last: "Doe",
        street: "111 First Street",
        city: "Cleveland",
        state: "OH",
        zip: "44118"},
    {
        addressId: 2,
        first: "Ben",
        last: "Doe",
        street: "222 Second Street",
        city: "Chicago",
        state: "IL",
        zip: "44117"},
    {
        addressId: 3,
        first: "Matt",
        last: "Doe",
        street: "333 Third Street",
        city: "St. Louis",
        state: "MO",
        zip: "55703"}
];

var dummyDetailsAddress =
        {
            addressId: "27",
            first: "John",
            last: "Smith",
            street: "27 Main Street",
            city: "Columbus",
            state: "OH",
            zip: "44506"
        };

var dummyEditAddress =
        {
            addressId: 45,
            first: "James",
            last: "Thomas",
            street: "3333 Park Street",
            city: "Cincinnati",
            state: "OH",
            zip: "55012"
        };