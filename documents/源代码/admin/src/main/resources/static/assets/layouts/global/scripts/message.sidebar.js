/**
 * Created by Odds on 2017/11/16.
 */

$(document).ready(function () {

    $(".page-sidebar-msg").sidebar({side: 'right'});
    // Click handlers
    $(".btn-sidebar-toggle[data-action]").on("click", function () {
        var $this = $(this);
        var action = $this.attr("data-action");
        var side = $this.attr("data-side");
        $(".page-sidebar-msg").trigger("sidebar:" + action);
        return false;
    });
    msgSlimScroll();
    $(window).on("resize", msgSlimScroll);
});

function msgSlimScroll() {
    var height = document.documentElement.clientHeight
    $("#message-inner").slimScroll({
        height: (height - 125) + "px",
        color: '#657b8d', //滚动条颜色
    });
}
