
const arr = [];
for (var i = 1; i < 114; i++) {
    var url = "https://public.ch.files.1drv.com/y4mJT5ydTEXHCyxqyYONaxFaVSv5CXeWV000fY_koTjurcBiaGFgluOshSPH_X2KB907beLj9qHbmGKiQ0kT1Hqvdxqs0CMQGMt_9FI3YfbwQpydyT8MpDAmqXw0H7HJrJHXQPDLeQb6eQ3dIRqvRJR1BDO54gfnaHULV7pfgOMJAas6lpeCJP2HDJ2KBcuuJtaE26hpEp-LG6y8tM4lutyHvJ3I2WHui1_kw2NYGGOT5IYRWnaQ31ZWAEIfVOuAL_j/Track_" + i + ".mp3";
    arr.push(url);
}
arr.forEach(async function (url) {
    var win = window.open(url, '_blank');
    if (win != null) {
        win.focus();
    }
})
