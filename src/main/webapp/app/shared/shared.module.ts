import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgbDateAdapter } from '@ng-bootstrap/ng-bootstrap';

import { NgbDateMomentAdapter } from './util/datepicker-adapter';
import { DoctorApiGatewaySharedLibsModule, DoctorApiGatewaySharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
    imports: [DoctorApiGatewaySharedLibsModule, DoctorApiGatewaySharedCommonModule],
    declarations: [HasAnyAuthorityDirective],
    providers: [{ provide: NgbDateAdapter, useClass: NgbDateMomentAdapter }],
    exports: [DoctorApiGatewaySharedCommonModule, HasAnyAuthorityDirective],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class DoctorApiGatewaySharedModule {}
