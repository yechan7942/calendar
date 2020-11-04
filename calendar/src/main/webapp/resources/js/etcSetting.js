/**
 * 
 */
//datetimepicker
$(function(){
		$('#edit-end').bootstrapMaterialDatePicker({ format:'YYYY-MM-DD HH:mm', weekStart : 0 });
		$('#edit-start').bootstrapMaterialDatePicker({ format:'YYYY-MM-DD HH:mm', weekStart : 0 }).on('change', function(e, date)
		{
		$('#edit-end').bootstrapMaterialDatePicker('setMinDate', date);
		});

		});

$(function(){
	$('#edit-color').change(function () {
	    $(this).css('color', $(this).val());
	});	
});

