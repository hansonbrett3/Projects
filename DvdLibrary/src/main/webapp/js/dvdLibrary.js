/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    loadDvds();
});

function loadDvds() {

    clearDvdTable();

    var dTable = $('#contentRows');

    $.each(testDvdData, function (index, dvd) {
        dTable.append($('<tr>')
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-dvd-id': dvd.dvdId,
                                    'data-toggle': 'modal',
                                    'data-target': '#detailsModal'
                                })
                                .text(dvd.title + ' ' + dvd.mpaa)
                                )
                        )
                .append($('<td>').text(dvd.director))
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-dvd-id': dvd.dvdId,
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

function clearDvdTable() {
    $('#contentRows').empty();
}

$('#detailsModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);
    modal.find('#dvd-id').text(dummyDetailsDvd.dvdId);
    modal.find('#dvd-title').text(dummyDetailsDvd.title);
    modal.find('#dvd-released').text(dummyDetailsDvd.released);
    modal.find('#dvd-mpaa').text(dummyDetailsDvd.mpaa);
    modal.find('#dvd-director').text(dummyDetailsDvd.director);
    modal.find('#dvd-studio').text(dummyDetailsDvd.studio);
    modal.find('#dvd-rating').text(dummyDetailsDvd.rating);
    modal.find('#dvd-note').text(dummyDetailsDvd.note);
});

$('#editModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);
    modal.find('#dvd-id').text(dummyEditDvd.dvdId);
    modal.find('#edit-title').val(dummyEditDvd.title);
    modal.find('#edit-released').val(dummyEditDvd.released);
    modal.find('#edit-mpaa').val(dummyEditDvd.mpaa);
    modal.find('#edit-director').val(dummyEditDvd.director);
    modal.find('#edit-studio').val(dummyEditDvd.studio);
    modal.find('#edit-rating').val(dummyEditDvd.rating);
    modal.find('#edit-note').val(dummyEditDvd.note);
});

var testDvdData = [
    {
        dvdId: 1,
        title: "Star Wars I",
        released: "1989",
        mpaa: "PG",
        director: "George Lucas",
        studio: "Warner Brothers",
        rating: "Good",
        note: "Seen"},
    {
        dvdId: 2,
        title: "Star Wars II",
        released: "1991",
        mpaa: "PG-13",
        director: "George Lucas II",
        studio: "Universal",
        rating: "Better",
        note: "Seen"},
    {
        dvdId: 1,
        title: "Star Wars III",
        released: "1993",
        mpaa: "R",
        director: "George Lucas III",
        studio: "Paramount",
        rating: "Best",
        note: "Seen"}
];

var dummyDetailsDvd =
        {
            dvdId: 45,
            title: "Star Wars 45",
            released: "1945",
            mpaa: "PG-45",
            director: "George Lucas XLV",
            studio: "Universal",
            rating: "Terrible",
            note: "Seen"
        };

var dummyEditDvd =
        {
            dvdId: 50,
            title: "Star Wars ",
            released: "1950",
            mpaa: "PG-50",
            director: "George Lucas XL",
            studio: "Universal",
            rating: "Amazing",
            note: "Seen"
        };